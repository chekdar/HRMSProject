package Meds.HRMSProject.entities.concretes;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="locations")
@Entity

public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="location_id")
  private int locationId;
			     
 @Column(name="country_id")
 private int country_id;
 
 @Column(name="location_name")
 private String locationName;
 
  @Column(name="location_address")
  private String locationAddress;
			     
  @Column(name="location_details")
  private String locationDetails;

}
