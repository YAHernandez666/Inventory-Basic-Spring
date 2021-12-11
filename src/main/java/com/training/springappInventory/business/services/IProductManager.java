package com.training.springappInventory.business.services;
import java.util.List;

import com.training.springappInventory.business.entities.Product;
public interface IProductManager {

	 public void increasePrice(int percentage);

	 public List<Product> getProducts();
	 
	 public void addProduct(String name, Double price);
	 
	 

}
