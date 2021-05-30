package Meds.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Meds.HRMSProject.business.abstracts.CountryService;
import Meds.HRMSProject.core.utilities.results.DataResult;
import Meds.HRMSProject.core.utilities.results.Result;
import Meds.HRMSProject.core.utilities.results.SuccessDataResult;
import Meds.HRMSProject.core.utilities.results.SuccessResult;
import Meds.HRMSProject.dataAccess.abstracts.CountryDao;
import Meds.HRMSProject.entities.concretes.Country;

@Service
public class CountryManager implements CountryService {

	private CountryDao countryDao;	
	
	@Autowired
	public CountryManager(CountryDao countryDao) {
		super();
		this.countryDao = countryDao;
	}

	@Override
	public DataResult<List<Country>> getAll() {
		 
		return new SuccessDataResult<List<Country>>(this.countryDao.findAll(),"Liste Geldi"); 
	}

	@Override
	public DataResult<List<Country>> getAllSorted() {
		 
		return null;
	}

	@Override
	public DataResult<List<Country>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Country country) {
		this.countryDao.save(country);
		return new SuccessResult("Şehir Eklendi");
	}

	@Override
	public DataResult<Country> getByCountryName(String CountryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Country> getByCountryNameAndRegionName(String CountryName, int Region) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Country>> getByCountryNameOrRegionName(String CountryName, int Region) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Country>> getByRegionIdIn(List<Integer> Regions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Country>> getByCountryNameContains(String CountryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Country>> getByCountryNameStartsWith(String CountryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Country>> getByNameAndRegion(String CountryName, int Region) {
		// TODO Auto-generated method stub
		return null;
	}

}
