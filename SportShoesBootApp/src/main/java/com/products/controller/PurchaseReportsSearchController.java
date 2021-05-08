package com.products.controller;

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

import com.products.model.PurchaseReports;
import com.products.service.PurchaseReportsSearchService;

import io.swagger.annotations.Api;

@RestController
@Api(value="SportShoesAPI", description="This is a SportShoes API, you can login using admin credentials - manage & categorize the products, browse list of all users & search by name/contact and view purchase lists by date and category")
@RequestMapping("/sportshoesapi")
public class PurchaseReportsSearchController {
	
	@Autowired
	private PurchaseReportsSearchService prodReService;
	
	@GetMapping(value = "/reports")
	public List<PurchaseReports> getAll()
	{
		return prodReService.getAll();
	}
	
	@GetMapping(value = "/reports/category/{category}")
	public List<PurchaseReports> getPurchasesByCat(@PathVariable(value = "category")String category)
	{
		return prodReService.getPurchasesByCat(category);
	}
	
	@GetMapping(value = "/reports/{id}")
	public PurchaseReports getPurchasesById(@PathVariable(value = "id")int id)
	{
		return prodReService.getPurchasesById(id);
	}
	
	@GetMapping(value = "/reports/date/{date}")
	public List<PurchaseReports> getPurchasesByDate(@PathVariable(value = "date")String date)
	{
		return prodReService.getPurchasesByDate(date);
	}

}
