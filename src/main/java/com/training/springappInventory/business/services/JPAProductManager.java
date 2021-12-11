package com.training.springappInventory.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springappInventory.business.entities.Product;
import com.training.springappInventory.business.repositories.IProductRepository;

@Service
public class JPAProductManager implements IProductManager {

    @Autowired
    private IProductRepository productRepository;

    @Override
	public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
	public void increasePrice(int percentage) {
        List<Product> products = (List<Product>) productRepository.findAll();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
                productRepository.save(product);
            }
        }
    }

	@Override
	public void addProduct(String name, Double price) {
		Product newproduct = new Product();
		newproduct.setDescription(name);
		newproduct.setPrice(price);
		productRepository.save(newproduct);
		
	}
}