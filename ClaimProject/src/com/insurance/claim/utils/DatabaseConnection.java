package com.insurance.claim.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DatabaseConnection {
	private static Connection connection = null;
	public static Connection getConnection() {
	
	
		try {

			String user = "alekhya";
			String pass = "alekhya";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			DriverManager.registerDriver(new OracleDriver());
		 connection = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}
	
	public static void closeConnection() {
		try {
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
