package com.products.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Users;


public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	public List<Users> findByFirstname(String firstname);
	public List<Users> findByLastname(String lastname);
	public Users findByContact(long contact);

}
