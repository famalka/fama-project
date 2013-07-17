package com.cybergen.specmatcher.HWComponents;

import com.cybergen.specmatcher.abstracts.AHardwareComponent;

public class CPU extends AHardwareComponent{
	private int cores;
	private float speed;
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
  

}
