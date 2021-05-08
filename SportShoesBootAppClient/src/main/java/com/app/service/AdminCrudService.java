package com.app.service;

import java.util.List;

import com.app.model.Admin;

public interface AdminCrudService {
	
	public Admin createAdmin(Admin admin);
	public Admin updatePwd(int id, Admin admin);
	public List<Admin> getAll();

}
