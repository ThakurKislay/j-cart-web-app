package com.jsp.prepared_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsertProductController 
{
	public static void main(String[] args) {
		Connection connection=ProductConnection.getProductConnection();
		if(connection!=null)
		{
			String insertProductQuery="insert into product (productid,productname,productcolor,productprice) value(?,?,?,?)";
			PreparedStatement preparedStstement;
			try {
				preparedStstement=connection.prepareStatement(insertProductQuery);
				preparedStstement.setInt(1, 6006);
				preparedStstement.setString(2, "APPLE");
				preparedStstement.setString(3, "White");
				preparedStstement.setDouble(4,99000);
				preparedStstement.execute();
				System.out.println("Data Stored.....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
