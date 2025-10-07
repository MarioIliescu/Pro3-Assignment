package via.pro3.slaughterhouse.model;

import jakarta.persistence.*;

@Entity @Table(name = "product", schema = "slaughterhouse")
public class Product
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  private String description;

  // Getters
  public Integer getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getDescription()
  {
    return description;
  }

  // Setters
  public void setId(Integer id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }
}
