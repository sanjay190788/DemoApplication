package com.demo.sanjay.services;

import java.util.List;
import java.util.Optional;

import com.demo.sanjay.model.LabelTypeEnum;
import com.demo.sanjay.model.ProductModel;

public interface DiscountService {
	
	
	/**
	 * 
	 * 
	 * 
	 * @param categoryId
	 * @param priceLabelType
	 * @return List<ProductModel>
	 */
	
	List<ProductModel> getDiscountedProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType);

}