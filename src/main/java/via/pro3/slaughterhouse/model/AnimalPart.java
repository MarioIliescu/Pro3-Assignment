package via.pro3.slaughterhouse.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "animal_part", schema = "slaughterhouse")
public class AnimalPart
{

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

  @Column(unique = true, nullable = false) private Integer animalId;
  private double weight;
  private String partType;

  // getters and setters
  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getAnimalId()
  {
    return animalId;
  }

  public void setAnimalId(Integer animalId)
  {
    this.animalId = animalId;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public String getPartType()
  {
    return partType;
  }

  public void setPartType(String partType)
  {
    this.partType = partType;
  }
}