package com.digital.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/digital","root","123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
