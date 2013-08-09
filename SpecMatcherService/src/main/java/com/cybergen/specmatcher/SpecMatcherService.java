package com.cybergen.specmatcher;

import com.cybergen.specmatcher.HWComponents.HDD;
import com.cybergen.specmatcher.dao.SpecMatcherDAO;
import com.cybergen.specmatcher.enums.Quality;

public class SpecMatcherService{
	
	public HDD[] test(int quality){
		Quality qualitya=Quality.values()[quality];
		
		SpecMatcherDAO.createDatabaseConnection();
		return SpecMatcherDAO.getHDDbyQuality(qualitya);
	}

	

}