package via.pro3.slaughterhouse.services;



import com.slaughterhouse.grpc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import via.pro3.slaughterhouse.model.Tray;
import via.pro3.slaughterhouse.repositories.TrayRepository;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TrayServiceTest {

    @Mock
    private TrayRepository trayRepository;

    @InjectMocks
    private TrayService trayService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createTray() {
        // Don't set ID - it should be generated
        Tray tray = new Tray();
        tray.setMaxWeight(25.5);
        tray.setPart_type("Leg");

        CreateTrayRequest request = CreateTrayRequest.newBuilder()
                .setTray(com.slaughterhouse.grpc.Tray.newBuilder()
                        .setMaxWeight(25.5)
                        .setPartType("Leg")
                        .build())
                .build();

        // Capture what's being saved and return it with an ID
        ArgumentCaptor<Tray> trayCaptor = ArgumentCaptor.forClass(Tray.class);
        when(trayRepository.save(trayCaptor.capture())).thenAnswer(invocation -> {
            Tray saved = invocation.getArgument(0);
            saved.setId(1); // Simulate DB-generated ID
            return saved;
        });

        // when
        CreateTrayResponse response = trayService.createTray(request);

        // then
        assertNotNull(response);
        assertNotNull(response.getTray());
        assertEquals(1, response.getTray().getId());
        assertEquals(25.5, response.getTray().getMaxWeight());
        assertEquals("Leg", response.getTray().getPartType());

        // Verify the saved entity has correct values
        Tray savedTray = trayCaptor.getValue();
        assertEquals(25.5, savedTray.getMaxWeight());
        assertEquals("Leg", savedTray.getPart_type());

        verify(trayRepository, times(1)).save(any(Tray.class));
    }

    @Test
    void listTrays() {
        Tray t1 = new Tray();
        t1.setId(1);
        t1.setMaxWeight(10.0);
        t1.setPart_type("Leg");

        Tray t2 = new Tray();
        t2.setId(2);
        t2.setMaxWeight(20.0);
        t2.setPart_type("Head");

        when(trayRepository.findAll()).thenReturn(Arrays.asList(t1, t2));

        ListTraysResponse response = trayService.listTrays();

        assertEquals(2, response.getTraysCount());
        verify(trayRepository).findAll();
    }

    @Test
    void getTray() {
        Tray tray = new Tray();
        tray.setId(5);
        tray.setMaxWeight(15.5);
        tray.setPart_type("Tail");

        when(trayRepository.findById(5)).thenReturn(Optional.of(tray));

        com.slaughterhouse.grpc.Tray result = trayService.getTray(5);

        assertNotNull(result);
        assertEquals(5, result.getId());
        assertEquals("Tail", result.getPartType());
    }
    // - not found
    @Test
    void getTray_ReturnsNullIfNotFound() {
        when(trayRepository.findById(100)).thenReturn(Optional.empty());

        com.slaughterhouse.grpc.Tray result = trayService.getTray(100);

        assertNull(result);
    }

    @Test
    void deleteTray() {
        when(trayRepository.existsById(7)).thenReturn(true);

        DeleteResponse response = trayService.deleteTray(7);

        assertFalse(response.hasError());
        verify(trayRepository).deleteById(7);
    }

    // not found
    @Test
    void deleteTray_ShouldReturnErrorIfNotFound() {
        when(trayRepository.existsById(99)).thenReturn(false);

        DeleteResponse response = trayService.deleteTray(99);

        assertTrue(response.hasError());
        assertEquals(404, response.getError().getCode());
        assertEquals("Tray not found", response.getError().getMessage());
        verify(trayRepository, never()).deleteById(anyInt());
    }
}

