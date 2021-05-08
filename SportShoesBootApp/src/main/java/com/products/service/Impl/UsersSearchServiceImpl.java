package com.products.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Users;
import com.products.repository.UsersRepository;
import com.products.service.UsersSearchService;

@Service
public class UsersSearchServiceImpl implements UsersSearchService{
	
	@Autowired
	private UsersRepository userRepo;

	@Override
	public List<Users> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public List<Users> getPlayersByLName(String lastname) {
		
		return userRepo.findByLastname(lastname);
	}
	
	@Override
	public List<Users> getPlayersByFName(String firstname) {
		
		return userRepo.findByFirstname(firstname);
	}

	
}
