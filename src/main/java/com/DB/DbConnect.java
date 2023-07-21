package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	private static Connection conn;
	public static Connection getConn() {
		return conn;
	}
	public static void setConn(Connection conn) {
		try {
			if(conn==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306//job4_it","root","tiger");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getconn() {
		return conn;
	}
}
