package com.thoughtFocus.Hibernet.AssesmentTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
		public static void main(String[] args) {
				Connection connection = null;
				try {
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thoughtfocus", "root", "Bakka@1434");
					if (connection != null) {
						System.out.println("connection is acquired successfully");
					} else {
						System.out.println("connection failed");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				Dto dto =new Dto();

				dto.setName("chart");
				dto.setPrice(25.10);
				dto.setType("green");
				dto.setQunatity(10);
				dto.setBrandname("plain");
				dto.setSerialnumber(643796);
				
				Dao dao= new Dao(connection);
				
				dao.add(dto);
				
				dao.getAll();

		}
			
		
}
