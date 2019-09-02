package com.demo.sanjay.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.sanjay.domain.ColorSwatch;
import com.demo.sanjay.domain.Price;
import com.demo.sanjay.domain.Product;
import com.demo.sanjay.model.ColorSwatchModel;
import com.demo.sanjay.model.LabelTypeEnum;
import com.demo.sanjay.model.ProductModel;

public class ProductToProductModelConverter {

	public ProductModel convert(Product source, Optional<LabelTypeEnum> labelType) {

		if (source == null)
			return null;

		String priceLabel = printPriceLabel(labelType, source.getPrice());

		ProductModel target = new ProductModel();

		target.setId(source.getProductId());
		target.setTitle(source.getTitle());
		target.setPriceLabel(priceLabel);
		target.setNowPrice(nowPrice(source.getPrice()));
		List<ColorSwatchModel> list = new ArrayList<>();
		ColorSwatchModel colorSwatchModel;
		for (ColorSwatch x : source.getColorSwatches()) {
			colorSwatchModel = new ColorSwatchModel();
			colorSwatchModel.setColor(x.getColor());
			if (x.getBasicColor() != null) {
				colorSwatchModel.setRgbColor(ColourConverter.getHexaVal(x.getBasicColor()));
			} else {
				colorSwatchModel.setRgbColor(x.getBasicColor());
			}
			colorSwatchModel.setBasicColor(x.getBasicColor());
			colorSwatchModel.setSkuid(x.getSkuId());

			list.add(colorSwatchModel);
			target.setColorSwatches(list);
		}

		return target;

	}

	/**
	 * which is the price.now represented as a string, including the currency,
	 * e.g. “£1.75”. For values that are integer, if they are less £10 return a
	 * decimal price, otherwise show an integer price, e.g. “£2.00” or “£10”.
	 * 
	 * @param price
	 *            Price.class
	 * @return String
	 */
	private String nowPrice(Price price) {
		Float nowPrice = 0.0f;
		try {
			nowPrice = Float.parseFloat((String) price.getNow());
		} catch (Exception e) {

		}
		return nowPrice < 10 ? price.getCurrency().getResponse() + Math.round(nowPrice)
				: price.getCurrency().getResponse() + nowPrice;
	}

	/**
	 * price label processes
	 * 
	 * @param labelType
	 *            Optional<LabelTypeEnum>
	 * @param price
	 *            Price
	 * @return String
	 */
	private String printPriceLabel(Optional<LabelTypeEnum> labelType, Price price) {

		String response = "";

		LabelTypeEnum priceLabel = labelType.map(x -> {
			return x;
		}).orElse(LabelTypeEnum.ShowWasNow);

		if (LabelTypeEnum.ShowWasNow.equals(priceLabel)) {
			response = price.getWas().map(x -> {
				return "Was " + price.getCurrency().getResponse() + x + ", now " + nowPrice(price);
			}).orElse("Was " + nowPrice(price) + ", now " + nowPrice(price));

		} else if (LabelTypeEnum.ShowWasThenNow.equals(priceLabel)) {
			// Didn't understand the scenario
		} else if (LabelTypeEnum.ShowPercDscount.equals(priceLabel)) {
			// Didn't understand the scenario
		}
		return response;
	}
}
