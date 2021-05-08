package com.products.service;

import java.util.List;

import com.products.model.Users;

public interface UsersSearchService {
	
	public List<Users> getAllUsers();
	public List<Users> getPlayersByLName(String lastname);
	public List<Users> getPlayersByFName(String firstname);

}
