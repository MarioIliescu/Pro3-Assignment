package via.pro3.slaughterhouse;

import com.slaughterhouse.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import via.pro3.slaughterhouse.model.AnimalPart;
import via.pro3.slaughterhouse.repositories.ProductRepository;
import via.pro3.slaughterhouse.services.*;

@SpringBootApplication
public class Start {

  private static final Logger log = LoggerFactory.getLogger(Start.class);

  public static void main(String[] args) {
    SpringApplication.run(Start.class, args);
    }
}
