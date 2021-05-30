package Meds.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="regions")
@Entity

public class Region {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="region_id")
	private int region_id;
	
	@Column(name="region_name")
	private String region_name;
	
	@Column(name="region_description")
	private String region_description;
	
	@OneToMany(mappedBy = "regions")
	private List<Country> counrties;

}
