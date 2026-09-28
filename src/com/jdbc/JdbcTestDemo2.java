package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch74", "root","root");
		Statement stmt = con.createStatement();
		String sql = "create table students5 (sid int ,sname varchar(20),primary key(sid))";
		stmt.executeUpdate(sql);
	}

}
