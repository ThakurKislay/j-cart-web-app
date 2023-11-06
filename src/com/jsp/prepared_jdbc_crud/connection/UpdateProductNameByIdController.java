package com.jsp.prepared_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;

public class UpdateProductNameByIdController 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product name:");
		String name=sc.next();
		System.out.println("Enter the Product Price:");
		double price=sc.nextDouble();
		System.out.println("Enter the Product Color:");
		String color=sc.next();
		Connection connection=ProductConnection.getProductConnection();
		String UpdateQuery="Update product set productname=?,productprice=?,productcolor=? where productid=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(UpdateQuery);
			preparedStatement.setString(1, name);
			preparedStatement.setDouble(2, price);
			preparedStatement.setString(3, color);
			preparedStatement.setInt(4,6006 );
			int productid=preparedStatement.executeUpdate();
			double productprice=preparedStatement.executeLargeUpdate();
			if(productid!=0)
			{
				System.out.println("Data is Updated");
			}
			else
			{
				System.out.println("ID is not Found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
