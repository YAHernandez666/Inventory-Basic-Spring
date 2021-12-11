package com.training.springappInventory.business.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AddProduct {
	
	 protected final Log logger = LogFactory.getLog(getClass());
	
	private String nameProduct;
	private Double priceProduct;

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	
	
	

}
