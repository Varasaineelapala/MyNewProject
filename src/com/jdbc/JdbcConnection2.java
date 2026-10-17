package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/citylibrary", "root", "root");
			stmt = con.createStatement();
			int n = stmt.executeUpdate("insert into employee values(6,'kumar',35000)");
			if (n > 0) {
				System.out.println(n + " rows affected..!");
			} else {
				System.err.println("something went wrong..!");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
