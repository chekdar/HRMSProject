package Meds.HRMSProject.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="departmants")
@Entity
public class Departmant {
	
	private int depatmants_id;
	private int location_id;
	private String depatmants_name;
	private String depatmants_address;
	private String depatmants_details;

}
