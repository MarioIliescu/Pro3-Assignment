package via.pro3.slaughterhouse.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_to_part", schema = "slaughterhouse")

public class ProductToPart
{

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;

  private int productId;
  private int partId;

  private int quantity;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getProductId()
  {
    return productId;
  }

  public void setProductId(int productId)
  {
    this.productId = productId;
  }

  public int getPartId()
  {
    return partId;
  }

  public void setPartId(int partId)
  {
    this.partId = partId;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }

}

