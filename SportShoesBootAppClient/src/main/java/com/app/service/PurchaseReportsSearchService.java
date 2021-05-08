package com.app.service;

import java.util.List;

import com.app.model.PurchaseReports;

public interface PurchaseReportsSearchService {
	
	public List<PurchaseReports> getAll();
	public PurchaseReports getPurchasesById(int id);
	public List<PurchaseReports> getPurchasesByCat(String category);
	public List<PurchaseReports> getPurchasesByDate(String date);


}
