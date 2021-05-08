package com.app.model;

public class PurchaseReports {
	
	private int id;
	private String productname;
	private String price;
	private String category;
	private String createdate;
	
	public PurchaseReports()
	{
		
	}
	
	public PurchaseReports(String productname, String price, String category, String createdate) {
		super();
		this.productname = productname;
		this.price = price;
		this.category = category;
		this.createdate = createdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "PurchaseReports [id=" + id + ", productname=" + productname + ", price=" + price + ", category="
				+ category + ", createdate=" + createdate + "]";
	}
	

}
