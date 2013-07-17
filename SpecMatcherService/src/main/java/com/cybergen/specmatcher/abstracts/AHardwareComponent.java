package com.cybergen.specmatcher.abstracts;

import com.cybergen.specmatcher.enums.Quality;

/**
 * This class contains some common features for hardware components
 * A is used at the beginning of the class name to depict that this is an abstract class
 * @author asanka
 *
 */
abstract public class AHardwareComponent {
	private String componentName;
	private String brandName;
	private String manufacturer;
	private Quality quality;
	private float price;
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Quality getQuality() {
		return quality;
	}
	public void setQuality(Quality quality) {
		this.quality = quality;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
