package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Users;
import com.app.service.UsersSearchService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="SportShoesAPI", description="This is a SportShoes API Client, you can login using admin credentials - manage & categorize the products, browse list of all users & search by name/contact and view purchase lists by date and category")
@RequestMapping("/sportshoesapi")

public class UsersSearchController {
	@Autowired
	private UsersSearchService userService;
	
	@GetMapping(value = "/users")
	public List<Users> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping(value = "/users/lastname/{lastname}")
	public List<Users> getPlayersByLName(@PathVariable(value = "lastname")String lastname)
	{
		return userService.getPlayersByLName(lastname);
	}
	
	@GetMapping(value = "/users/firstname/{firstname}")
	public List<Users> getPlayersByFName(@PathVariable(value = "firstname")String firstname)
	{
		return userService.getPlayersByFName(firstname);
	}

}
