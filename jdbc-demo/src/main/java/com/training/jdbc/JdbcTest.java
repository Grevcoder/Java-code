package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url="jdbc:sqlserver:\\localhost//Mars";
		String url="jdbc:sqlserver://localhost:1433;" +
		"databaseName=Mars;" + 
		"encrypt=true;trustServerCertificate=true";
		String user="sa";
		String password="admin";
		Connection con=DriverManager.getConnection(url,user,password);
		/*if(con!=null) {
			System.out.println("connection successful");
		}
		else
		{
			System.out.println("Not connected");

		}*/
		
		String query="select * from product";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("prod_name" +rs.getString("prod_name"));
			System.out.println("prod_desc" +rs.getString("prod_desc"));
			System.out.println("price" +rs.getString("price"));
		}
	}

}
