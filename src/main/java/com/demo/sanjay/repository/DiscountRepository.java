package com.demo.sanjay.repository;

import java.util.List;

import com.demo.sanjay.domain.Product;

public interface DiscountRepository {
	
	List<Product> getDiscountedProducts(Integer categoryId);

}
