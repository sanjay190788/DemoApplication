
package com.demo.sanjay.domain;

import java.util.List;

public class Category {

	private List<Product> products;

	public Category() {
		// Default Constructor
	}

	public Category(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
