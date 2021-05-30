package Meds.HRMSProject.business.abstracts;

import java.util.List;

import Meds.HRMSProject.core.utilities.results.DataResult;
import Meds.HRMSProject.core.utilities.results.Result;
import Meds.HRMSProject.entities.concretes.Country;

public interface CountryService {
	
  DataResult<List<Country>> getAll();
  DataResult<List<Country>> getAllSorted();
  DataResult<List<Country>> getAll(int pageNo, int pageSize);
      
  Result add(Country country);
	
  DataResult<Country> getByCountryName(String CountryName);
  DataResult<Country> getByCountryNameAndRegionName(String CountryName,int Region);
	
  DataResult<List<Country>> getByCountryNameOrRegionName(String CountryName, int Region);
	
  DataResult<List<Country>> getByRegionIdIn(List<Integer>Regions);
  DataResult<List<Country>> getByCountryNameContains(String CountryName);
	
  DataResult<List<Country>> getByCountryNameStartsWith(String CountryName);	
	 
  DataResult<List<Country>> getByNameAndRegion(String CountryName, int Region);

}
