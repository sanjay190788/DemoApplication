package com.demo.sanjay.domain;

public class PriceNowModel {
	private String from;
	private String to;

	public PriceNowModel() {
		// Default Constructor
	}

	public PriceNowModel(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}