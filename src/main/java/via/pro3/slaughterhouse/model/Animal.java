package via.pro3.slaughterhouse.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "animal", schema = "slaughterhouse")
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true, nullable = false)
  private String registrationNumber;

  private double weight;

  private LocalDateTime arrivalTime;

  @Column(nullable = false)
  private String origin;

  // getters and setters
  public Integer getId() { return id; }
  public void setId(Integer id) { this.id = id; }

  public String getRegistrationNumber() { return registrationNumber; }
  public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

  public double getWeight() { return weight; }
  public void setWeight(double weight) { this.weight = weight; }

  public LocalDateTime getArrivalTime() { return arrivalTime; }
  public void setArrivalTime(LocalDateTime arrivalTime) { this.arrivalTime = arrivalTime; }

  public String getOrigin()
  {
    return origin;
  }

  public void setOrigin(String origin)
  {
    this.origin = origin;
  }
}


