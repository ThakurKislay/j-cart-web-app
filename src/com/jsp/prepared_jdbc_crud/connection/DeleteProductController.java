package com.jsp.prepared_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProductController 
{
	private static Scanner scanner;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Connection connection=ProductConnection.getProductConnection();
		String UpdateQuery="delete from product where productid=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(UpdateQuery);
			
			System.out.println("Please enter your id to delete product Item:");
			preparedStatement.setInt(1, sc.nextInt());
			int a=preparedStatement.executeUpdate();
			if(a!=0)
			{
				System.out.println("Data is deleted");
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
