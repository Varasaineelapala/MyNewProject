package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citylibrary", "root", "root");
			stmt = con.createStatement();
			String sql = "select * from dept";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " | ");
				System.out.print(rs.getString(2) + " | ");
				System.out.print(rs.getString(3) + " | ");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("in catch");
		} finally {
			if (con != null && stmt != null && rs != null) {
				con.close();
				stmt.close();
				rs.close();
			}
		}
	}

}
