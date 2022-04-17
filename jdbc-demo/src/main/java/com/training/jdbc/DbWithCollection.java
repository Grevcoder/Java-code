package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DbWithCollection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{

	//select all the attributes from product table
	  List<Product> productList = new ArrayList<Product>();
	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://localhost:1433;" +
		"databaseName=Mars;" + 
		"encrypt=true;trustServerCertificate=true";
		String user="sa";
		String password="admin";
		Connection con=DriverManager.getConnection(url,user,password);
		
	  String query="select * from product";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
		      
		      String productName=rs.getString("prod_name");
		      String productDescription=rs.getString("prod_desc");
		      int price=rs.getInt("price");
		      Product product = new Product(productName,productDescription,price);
		      product.setProd_name(productName);
		      product.setProd_desc(productDescription);
		      product.setPrice(price);
		      productList.add(product);
		    	//sort it in ascending orders
		        Collections.sort(productList, new SortByPrice());   
		}
		for(Product product1:productList)		
	    System.out.println( "Product Name:" +product1.getProd_name() +" Product Description " + product1.getProd_desc() + "Price " + product1.getPrice());


	}

}
