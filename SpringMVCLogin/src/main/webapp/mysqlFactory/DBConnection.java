package com.lc.mysqlFactory;

import java.sql.*;

public class DBConnection {

	private static Connection con;
	private DBConnection() {}

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		}
}
