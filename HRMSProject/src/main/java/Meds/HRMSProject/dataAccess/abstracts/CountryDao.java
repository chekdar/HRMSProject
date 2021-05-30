package Meds.HRMSProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Meds.HRMSProject.entities.concretes.Country;

public interface CountryDao extends JpaRepository<Country,Integer> {

	Country getByCountryName(String CountryName);
	Country getByCountryNameAndRegionName(String CountryName,int Region);
	
	List<Country>getByCountryNameOrRegionName(String CountryName, int Region);
	
	List<Country>getByRegionIdIn(List<Integer>Regions);
	List<Country>getByCountryNameContains(String CountryName);
	
	List<Country>getByCountryNameStartsWith(String CountryName);
	
	@Query("From Counrty Where countryName=:ContryName and RegionId=:Region")
	List<Country>getByNameAndRegion(String CountryName, int Region);
}
