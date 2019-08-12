package com.JavaFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
	
	public  Connection loadingDriver() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		System.out.println("Driver loaded successfully");
		String connectionUrl = "jdbc:sqlserver://ATMECSINLT-038\\SQLEXPRESS;database=fryday;integratedSecurity=true;" ; 
		Connection con = DriverManager.getConnection(connectionUrl); 
	              
		System.out.println("Connection build successfully");
		return con;
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;
	}
}
