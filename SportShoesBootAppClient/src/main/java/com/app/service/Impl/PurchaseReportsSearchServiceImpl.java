package com.app.service.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.model.Admin;
import com.app.model.Products;
import com.app.model.PurchaseReports;
import com.app.service.PurchaseReportsSearchService;

@Service
public class PurchaseReportsSearchServiceImpl implements  PurchaseReportsSearchService{
	
	private String url = "http://localhost:9000/sportshoesapi/reports/";
	private RestTemplate template = new RestTemplate();

	@Override
	public List<PurchaseReports> getAll() {
		ResponseEntity<List<PurchaseReports>> entity = template.exchange(url,  HttpMethod.GET, null, new ParameterizedTypeReference<List<PurchaseReports>>() {});
		return entity.getBody();
	}

	@Override
	public PurchaseReports getPurchasesById(int id) {
		ResponseEntity<PurchaseReports> entity = template.exchange(url +id,  HttpMethod.GET, null, new ParameterizedTypeReference<PurchaseReports>() {});
		return entity.getBody();
	}

	@Override
	public List<PurchaseReports> getPurchasesByCat(String category) {
		ResponseEntity<List<PurchaseReports>> entity = template.exchange(url + "category/" + category, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<PurchaseReports>>() {
				});
		return entity.getBody();
	}

	@Override
	public List<PurchaseReports> getPurchasesByDate(String date) {
		ResponseEntity<List<PurchaseReports>> entity = template.exchange(url + "date/" + date, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<PurchaseReports>>() {
				});
		return entity.getBody();
	}

}
