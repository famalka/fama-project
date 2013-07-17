package com.cybergen.specmatcher.HWComponents;

import com.cybergen.specmatcher.abstracts.AHardwareComponent;

public class RAM extends AHardwareComponent {
	private float size;
	private float busSpeed;
	public float getBusSpeed() {
		return busSpeed;
	}
	public void setBusSpeed(float busSpeed) {
		this.busSpeed = busSpeed;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}


}
