package com.jdb;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Exercise 1 : WAP in Java to create a table in database using jdbc with following specification :
                table : Company(id,name,code,location)
            -- write code to insert data in same table.
            -- write code to retrieve data in same table.
            -- write code to delete data in same table.
 * */

public class CreatingTableUsingJdbc {
	
	// JDBC URL, username, and password
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/StudentDB";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "everydays";
	
	public static void main(String[] args) {
		
		// declare connection and statement objects outside of try/catch block
		Connection connection = null;
		Statement statement = null;
		
		try {
			// JDBC Driver class for MySQL
			Driver MYSQL_JDBC_DRIVER = new com.mysql.cj.jdbc.Driver();
			
			// register the driver
			DriverManager.registerDriver(MYSQL_JDBC_DRIVER);
			
			// connect to database
			connection = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
			
			// check if the connection is successful
			if (connection != null) System.out.println("Connection Successful!");
			else System.out.println("Couldn't connect to Database!");
			
			// create statement
			statement = connection.createStatement();
			
			// SQL Query to create table if it does not exist
			String CRRATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS Company("
					+ "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(255),"
					+ "code VARCHAR(10),"
					+ "location VARCHAR(255)"
					+ ")";
			
			// execute the query to create table
			int count = statement.executeUpdate(CRRATE_TABLE_QUERY);
			if (count != 0) System.out.println("Table created successfully!");
			else System.out.println("Couldn't create the table!");
			
			// SQL query to insert the data
			String INSERT_DATA_QUERY = "INSERT INTO Company (name, code, location) VALUES(?,?,?)";
			PreparedStatement insertStatement = connection.prepareStatement(INSERT_DATA_QUERY);
			insertStatement.setString(1, "Google");
			insertStatement.setString(2, "GGL");
			insertStatement.setString(3, "Mountain View, CA");
			insertStatement.executeUpdate();
			
			// SQL Query to retrieve the data from the table
			String RETRIEVE_DATA_QUERY = "SELECT * FROM Company";
			ResultSet companyData = statement.executeQuery(RETRIEVE_DATA_QUERY);
			while (companyData.next()) {
				int id = companyData.getInt("id");
				String name = companyData.getString("name");
				String code = companyData.getString("code");
				String location= companyData.getString("location");
				System.out.println("ID: " + id + ", Name: " + name + ", Code: " + code + ", Location: " + location);
				
			}
			
			// SQL Query to delete data from the table
			String DELETE_DATA_QUERY = "DELETE FROM Company WHERE id = ?";
			PreparedStatement deleteStatement = connection.prepareStatement(DELETE_DATA_QUERY);
			deleteStatement.setInt(1, 1);
			deleteStatement.executeUpdate();
				
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try {
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
