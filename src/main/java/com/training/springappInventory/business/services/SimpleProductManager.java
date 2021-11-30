package com.training.springappInventory.business.services;

import java.util.List;

import com.training.springappInventory.business.entities.Product;

public class SimpleProductManager implements IProductManager {

	private List<Product> products;

	public void increasePrice(int percentage) {

		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue() * (100 + percentage) / 100;
				product.setPrice(newPrice);
			}
		}
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {

		return products;
	}

}
