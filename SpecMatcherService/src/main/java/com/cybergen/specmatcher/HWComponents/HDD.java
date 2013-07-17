package com.cybergen.specmatcher.HWComponents;

import com.cybergen.specmatcher.abstracts.AHardwareComponent;
import com.cybergen.specmatcher.enums.HDDType;

public class HDD extends AHardwareComponent {
	private float storage;// this should be specified in GB
	private int rpm;
    private HDDType hddType;
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
