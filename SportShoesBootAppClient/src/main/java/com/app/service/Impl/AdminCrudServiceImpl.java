package com.app.service.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.model.Admin;
import com.app.service.AdminCrudService;

@Service
public class AdminCrudServiceImpl implements AdminCrudService{

	private String url = "http://localhost:9000/sportshoesapi/admin/";
	private RestTemplate template = new RestTemplate();
	
	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return template.postForObject(url, admin, Admin.class);
	}

	@Override
	public Admin updatePwd(int id, Admin admin) {
		// TODO Auto-generated method stub
		template.put(url, admin);
		return admin;
	}

	@Override
	public List<Admin> getAll() {
		ResponseEntity<List<Admin>> entity = template.exchange(url,  HttpMethod.GET, null, new ParameterizedTypeReference<List<Admin>>() {});
		return entity.getBody();
	}

}
