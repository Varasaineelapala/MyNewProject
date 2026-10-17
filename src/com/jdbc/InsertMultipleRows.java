package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRows {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement preStmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citylibrary", "root", "root");
			preStmt = con.prepareStatement("Insert Into employee values(?,?,?)");
			System.out.println("Enter the no of employees you want to insert : ");
			int num = sc.nextInt();
			int n = 0;
			for (int i = 0; i < num; i++) {
				System.out.println("Enter the empployee id : ");
				int id = sc.nextInt();
				System.out.println("Enter the employee name : ");
				String name = sc.next();
				System.out.println("Enter employee salary : ");
				double salary = sc.nextDouble();
				preStmt.setInt(1, id);
				preStmt.setString(2, name);
				preStmt.setDouble(3, salary);
				n += preStmt.executeUpdate();
			}
			System.out.println(n + " Rows Inserted...!");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
