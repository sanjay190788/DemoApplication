package com.demo.sanjay.model;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

	private String id;
	private String title;
	private String nowPrice;
	private String priceLabel;
	private Float discount;
	private List<ColorSwatchModel> colorSwatches = new ArrayList<>();

	public ProductModel() {
		// Default Constructor
	}

	public ProductModel(String id, String title, String nowPrice, String priceLabel, Float discount,
			List<ColorSwatchModel> colorSwatches) {
		super();
		this.id = id;
		this.title = title;
		this.nowPrice = nowPrice;
		this.priceLabel = priceLabel;
		this.discount = discount;
		this.colorSwatches = colorSwatches;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public List<ColorSwatchModel> getColorSwatches() {
		return colorSwatches;
	}

	public void setColorSwatches(List<ColorSwatchModel> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}

}
