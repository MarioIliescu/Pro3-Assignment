package via.pro3.slaughterhouse.model;


import jakarta.persistence.*;


@Entity
@Table(name = "tray", schema = "slaughterhouse")
public class Tray {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
@Column(name = "part_type")
  private String partType;
@Column(name = "max_weight")
  private double maxWeight;
  // getters and setters
  public int getId() { return id; }
  public void setId(Integer id) { this.id = id; }


  public double getMaxWeight() { return maxWeight; }
  public void setMaxWeight(double maxWeight) { this.maxWeight = maxWeight; }

  public String getPart_type() { return partType; }
  public void setPart_type(String partType) { this.partType = partType; }
}
