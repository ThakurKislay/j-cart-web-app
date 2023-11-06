package com.jsp.prepared_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getProductByIdController 
{
	public static void main(String[] args) 
	{
		Connection connection=ProductConnection.getProductConnection();
		String selectQuery="select * from product where productid=?";
	
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, 2002);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				double productprice=resultSet.getDouble("productprice");
				int productid=resultSet.getInt("productid");
				String productname=resultSet.getString("productname");
				String productcolor=resultSet.getString("productcolor");
				
				System.out.println("==================================");
				System.out.println("Product id is:"+productid);
				System.out.println("Product Name is:"+productname);
				System.out.println("Product Color is:"+productcolor);
				System.out.println("Product Price is:"+productprice);
				
			}
			else
			{
				System.out.println("Id is not found:");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
