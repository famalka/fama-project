package com.cybergen.specmatcher.HWComponents;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybergen.specmatcher.abstracts.AHardwareComponent;
import com.cybergen.specmatcher.enums.HDDType;
import com.cybergen.specmatcher.enums.Quality;

public class HDD extends AHardwareComponent {
	private float storage;// this should be specified in GB
	private int rpm;
    private HDDType hddType;
    public HDD(ResultSet rs) throws SQLException{
    	setBrandName(rs.getString(2));
		setManufacturer(rs.getString(3));
		setQuality(Quality.values()[rs.getInt(4)]);
		setPrice(rs.getFloat(5));
		setStorage(rs.getFloat(6));
		setRpm(rs.getInt(7));
		setHddType(HDDType.values()[rs.getInt(8)]);
    }
	public HDD() {
		// TODO Auto-generated constructor stub
	}
	public float getStorage() {
		return storage;
	}
	public void setStorage(float storage) {
		this.storage = storage;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public HDDType getHddType() {
		return hddType;
	}
	public void setHddType(HDDType hddType) {
		this.hddType = hddType;
	}
    
	

}
