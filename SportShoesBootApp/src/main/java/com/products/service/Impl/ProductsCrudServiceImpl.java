package com.products.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Products;
import com.products.repository.ProductRepository;
import com.products.service.ProductsCrudService;

@Service
public class ProductsCrudServiceImpl implements ProductsCrudService{

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public Products createProduct(Products product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Products updatecategory(int id, Products product) {
		
			Products existingprod = productRepo.findById(id).get();
			existingprod.setCategory(product.getCategory());
			existingprod.setProductname(product.getProductname());
		
		return productRepo.save(existingprod);
	}

	@Override
	public Products getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		productRepo.deleteById(id);
		
	}

	
}
