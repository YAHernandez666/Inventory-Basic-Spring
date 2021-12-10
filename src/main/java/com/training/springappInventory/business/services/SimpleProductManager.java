package com.training.springappInventory.business.services;

import java.util.List;

import com.training.springappInventory.business.entities.Product;

public class SimpleProductManager implements IProductManager {

	private List<Product> products;
	private Product product;

	@Override
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

	@Override
	public List<Product> getProducts() {

		return products;
	}

	@Override
	public void addProduct(String name, double price) {
		product.setDescription(name);
		product.setPrice(price);
		
	}

}
