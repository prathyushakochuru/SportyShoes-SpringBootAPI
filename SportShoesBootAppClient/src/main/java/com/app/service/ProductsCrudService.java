package com.app.service;

import com.app.model.Products;

public interface ProductsCrudService {

	public Products createProduct(Products product);
	//public Products updateProduct(Products product);
	public Products getProductById(int id);
	public void deleteProductById(int id);
	public Products updatecategory(int id, Products product);
}
