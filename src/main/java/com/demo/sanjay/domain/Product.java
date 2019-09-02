package com.demo.sanjay.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productId;
	private String title;
	private Price price;
	private List<ColorSwatch> colorSwatches = new ArrayList<>();

	public Product() {
		// Default Constructor
	}

	public Product(String productId, String title, Price price, List<ColorSwatch> colorSwatches) {
		super();
		this.productId = productId;
		this.title = title;
		this.price = price;
		this.colorSwatches = colorSwatches;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public List<ColorSwatch> getColorSwatches() {
		return colorSwatches;
	}

	public void setColorSwatches(List<ColorSwatch> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}

}
