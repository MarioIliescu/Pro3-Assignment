package via.pro3.slaughterhouse.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "tray", schema = "slaughterhouse")
public class Tray {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Transient private AnimalPart animal_part;

  private double maxWeight;

  public AnimalPart getAnimal_part()
  {
    return animal_part;
  }

  // getters and setters
  public int getId() { return id; }
  public void setId(int id) { this.id = id; }


  public double getMaxWeight() { return maxWeight; }
  public void setMaxWeight(double maxWeight) { this.maxWeight = maxWeight; }

  public AnimalPart getAnimalPart() { return animal_part; }
  public void setAnimalPart(AnimalPart animal_part) { this.animal_part = animal_part; }
}
