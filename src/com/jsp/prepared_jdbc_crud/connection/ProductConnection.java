package com.jsp.prepared_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java .sql.SQLException;
import com.mysql.cj.jdbc.Driver;
public class ProductConnection 
{
	public static  Connection getProductConnection() {
		
		try {
			Driver driver =new Driver();
			String url="jdbc:mysql://localhost:3306/prepared-crud";
			String name="root";
			String password="root";
			System.out.println("Connection is created:");
			return DriverManager.getConnection(url, name, password);
		}catch(SQLException e) {
	
		
		e.printStackTrace();
	}
	return null;
}
}
