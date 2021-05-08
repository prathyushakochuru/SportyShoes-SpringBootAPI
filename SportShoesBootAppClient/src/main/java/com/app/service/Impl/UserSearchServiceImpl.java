package com.app.service.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.model.PurchaseReports;
import com.app.model.Users;
import com.app.service.UsersSearchService;
@Service
public class UserSearchServiceImpl implements UsersSearchService{
	
	private String url = "http://localhost:9000/sportshoesapi/users/";
	private RestTemplate template = new RestTemplate();

	@Override
	public List<Users> getAllUsers() {
		ResponseEntity<List<Users>> entity = template.exchange(url,  HttpMethod.GET, null, new ParameterizedTypeReference<List<Users>>() {});
		return entity.getBody();
	}

	@Override
	public List<Users> getPlayersByLName(String lastname) {
		ResponseEntity<List<Users>> entity = template.exchange(url + "lastname/" + lastname, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Users>>() {
				});
		return entity.getBody();
	}

	@Override
	public List<Users> getPlayersByFName(String firstname) {
		ResponseEntity<List<Users>> entity = template.exchange(url + "firstname/" + firstname, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Users>>() {
				});
		return entity.getBody();
	}
	
	

}
