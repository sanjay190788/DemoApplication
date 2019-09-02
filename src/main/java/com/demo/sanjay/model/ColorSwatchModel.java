package com.demo.sanjay.model;

public class ColorSwatchModel {

	private String color;
	private String rgbColor;
	private String skuid;
	private String basicColor;

	public ColorSwatchModel() {
		// Default Constructor
	}

	public ColorSwatchModel(String color, String rgbColor, String skuid) {
		super();
		this.color = color;
		this.rgbColor = rgbColor;
		this.skuid = skuid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRgbColor() {
		return rgbColor;
	}

	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}

	public String getSkuid() {
		return skuid;
	}

	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

	public String getBasicColor() {
		return basicColor;
	}

	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}

}
