package com.epicode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	String url = "jdbc;postgresql://localhost:5432/";
	String dbName = "Esercizio1Week3";
	String user = "postgres";
	String pass = "root";
	
	public DbConnection () throws SQLException {
		Connection conn = DriverManager.getConnection(url+dbName, user, pass);
		Statement st = conn.createStatement();
	}
}
