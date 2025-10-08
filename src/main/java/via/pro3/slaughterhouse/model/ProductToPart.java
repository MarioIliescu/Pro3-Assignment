package via.pro3.slaughterhouse.model;

import jakarta.persistence.*;

@Entity
public class ProductToPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "part_id")
    private Integer partId;

    @Column(name = "quantity")
    private Integer quantity;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPartId() {
        return partId;
    }
    public void setAnimalPartId(Integer partId) {
        this.partId = partId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}