package com.products.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.PurchaseReports;
import com.products.repository.PurchaseReportsRepository;
import com.products.service.PurchaseReportsSearchService;

@Service
public class PurchaseReportsSearchServiceImpl implements PurchaseReportsSearchService{

	@Autowired
	private PurchaseReportsRepository purchaseRepo;
	@Override
	public List<PurchaseReports> getAll() {
		
		return purchaseRepo.findAll();
	}

	@Override
	public PurchaseReports getPurchasesById(int id) {
		
		return purchaseRepo.findById(id).get();
	}

	@Override
	public List<PurchaseReports> getPurchasesByCat(String category) {
		
		return purchaseRepo.findByCategory(category);
	}
	
	@Override
	public List<PurchaseReports> getPurchasesByDate(String createdate) {
		
		return purchaseRepo.findByCreatedate(createdate);
	}

}
