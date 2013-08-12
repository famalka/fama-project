package com.cybergen.specmatcher.HWComponents;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybergen.specmatcher.abstracts.AHardwareComponent;
import com.cybergen.specmatcher.enums.HDDType;
import com.cybergen.specmatcher.enums.Quality;

public class CPU extends AHardwareComponent {
	public CPU(ResultSet rs) throws SQLException {
		setBrandName(rs.getString(2));
		setManufacturer(rs.getString(3));
		setQuality(Quality.values()[rs.getInt(4)]);
		setPrice(rs.getFloat(5));
		setCores(rs.getInt(6));
		setSpeed(rs.getFloat(7));

	}

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
