package com.app.model;

public class Products {
	private int id;
	private String productname;
	private String price;
	private String category;
	private String description;
	
	public Products()
	{
		
	}
	public Products(String productname, String price, String category, String description) {
		super();
		this.productname = productname;
		this.price = price;
		this.category = category;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productname=" + productname + ", price=" + price + ", category=" + category
				+ ", description=" + description + "]";
	}
	

}
