package com.demo.sanjay.domain;

public class ColorSwatch {
	private String skuId;
	private String color;
	private String basicColor;

	public ColorSwatch() {
		// Default Constructor
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBasicColor() {
		return basicColor;
	}

	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}
}
