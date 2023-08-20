package com.takeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			//Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjd34", "root", "aseem");
			if(con!=null) {
				System.out.println("Connection established");
			} else {
				System.out.println("Connection not established");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		finally {
			try {
				if(con!=null); {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
