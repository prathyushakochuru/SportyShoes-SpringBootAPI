package com.app.service.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.app.model.Products;
import com.app.service.ProductsCrudService;

@Service
public class ProductsCrudServiceImpl implements ProductsCrudService {

	private String url = "http://localhost:9000/sportshoesapi/product/";
	private RestTemplate template = new RestTemplate();
	@Override
	public Products createProduct(Products product) {
		// TODO Auto-generated method stub
		return template.postForObject(url, product, Products.class);
	}

	@Override
	public Products getProductById(int id) {
		// TODO Auto-generated method stub
		ResponseEntity<Products> entity = template.exchange(url +id,  HttpMethod.GET, null, new ParameterizedTypeReference<Products>() {});
		return entity.getBody();
		//return null;
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		template.delete(url+id);
		
		
	}

	@Override
	public Products updatecategory(int id, Products product) {
		// TODO Auto-generated method stub
		template.put(url, product);
		return null;
	}

}
