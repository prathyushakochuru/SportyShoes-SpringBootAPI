package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{
	
	//Repository to manage products and categorize them

}
