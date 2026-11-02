package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement preStmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citylibrary", "root", "root");
			preStmt = con.prepareStatement("update student74 set sname= ? , marks=? where sid=? ");
			preStmt.setString(1, "aniluu");
			preStmt.setInt(2, 10);
			preStmt.setInt(3, 4);
			int n=preStmt.executeUpdate();
			System.out.println(n+ " rows affected..!");

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
