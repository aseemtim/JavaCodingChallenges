package com.takeo.week5.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PractiseJdbc {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st = null;
		try {
			//Register driver
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connect db
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjd34", "root", "aseem");
			if (con!=null) {
				System.out.println("Connection established");
			} else {
				System.out.println("Connection did not establish");
			}
			
			createTable(con);
			insertRecord(con, 101, "Toyota", "TOY", "Japan");
			insertRecord(con, 102, "Tesla", "TES", "USA");
			insertRecord(con, 103, "Volkswagen", "VOL", "Germany");
			retrieveRecords(con);
			deleteRecord(con, "Tesla");
			retrieveRecords(con);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Create table
	public static void createTable(Connection con) throws SQLException {
		String createTable = "CREATE TABLE IF NOT EXISTS company (" + 
				"id int NOT NULL," + 
				"name VARCHAR(50)," +
				"code VARCHAR(10)," +
				"location VARCHAR(50)," + 
				"PRIMARY KEY (id))";
		
		//try with resource
		try (PreparedStatement st = con.prepareStatement(createTable)) {
			int count = st.executeUpdate();
			if(count==0) {
				System.out.println("Table created if didn't exist");
			} else {
				System.out.println("Table could not be created");
			}
		}
	}
	
	//Insert Record
	public static void insertRecord(
			Connection con, 
			Integer id, 
			String name, 
			String code, 
			String location) throws SQLException {
		
		String insertQuery= "INSERT INTO company values (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, code);
			ps.setString(4, location);
			
			int count = ps.executeUpdate();
			if (count == 1) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("Record did not insert");
			}
		}
	}
	
	//Retrieve Record
	public static void retrieveRecords(Connection con) throws SQLException {
		String selectQuery = "SELECT * FROM company";
		try (PreparedStatement ps = con.prepareStatement(selectQuery)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String code = rs.getString(3);
				String location = rs.getString(4);
				System.out.println(
						id + "\t" + 
						name + "\t" + 
						code + "\t" + 
						location);
			}
		}
	}

	//Delete Record
	public static void deleteRecord(Connection con, String name) throws SQLException {
		String deleteQuery = "DELETE FROM company WHERE name = " + "\'"+ name + "\'";
		try(PreparedStatement ps = con.prepareStatement(deleteQuery)) {
			int count = ps.executeUpdate();
			if (count!=0) {
				System.out.println("Record with name " + name + " deleted successfully.");
			} else {
				System.out.println("Record with name " + name + " could not be deleted.");
			}
		}
	}
}
