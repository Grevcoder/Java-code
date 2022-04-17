package com.training.jdbc;

public class Product  {
	private String prod_name;
	private String prod_desc;
	private int price;
	
	

	public Product(String prod_name, String prod_desc, int price) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.price = price;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
		}

