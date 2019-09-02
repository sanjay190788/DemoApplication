package com.demo.sanjay.model;

public enum CurrencyIconEnum {
	GBP("£"), USD("$"), EUR("€");
	
	private String icon;

	CurrencyIconEnum(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }
    
}
