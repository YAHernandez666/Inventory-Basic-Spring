package com.training.springappInventory.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.training.springappInventory.business.entities.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}