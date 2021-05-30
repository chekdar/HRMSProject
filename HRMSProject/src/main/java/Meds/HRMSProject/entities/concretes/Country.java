package Meds.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="countries")
@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private int countryid;	
	 
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="country_language")
	private String countryLanguage;
	
	@Column(name="country_currency")
	private String countryCurrency;
	
	@OneToOne()
	@JoinColumn(name="region_id")
	private Region region;

}
