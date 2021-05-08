package com.app.service;

import java.util.List;

import com.app.model.Users;

public interface UsersSearchService {
	
	public List<Users> getAllUsers();
	public List<Users> getPlayersByLName(String lastname);
	public List<Users> getPlayersByFName(String firstname);

}
