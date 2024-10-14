package com.snipe.learning.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestJDBC {
	public static String DB_URL="jdbc:mysql://localhost:3306/upldb";
	public static String DB_USERNAME="root";
	public static String DB_PASSWORD="root";
	public static String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		CallableStatement cstmt = null;
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			stmt = con.createStatement();
			String sql_query = "select * from upldb.employee";
			ResultSet result = stmt.executeQuery(sql_query);
			while(result.next()) {
				System.out.println("ID : "+result.getInt("id")+" Name : "+result.getString("name")+" Designation : "+result.getString("designation"));
			}
			
			pstmt = con.prepareStatement("insert into upldb.employee values(?,?,?)");
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Ratan");
			pstmt.setString(3, "Developer");
			int ret = pstmt.executeUpdate(); // For insert, update and delete
			System.out.println("ret : "+ret);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			stmt.close();
			con.close();
		}
	}
}
