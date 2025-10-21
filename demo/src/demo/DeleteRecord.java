package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded......");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","SaiVarshith@03");
		System.out.println("connection established...");
		Statement statement = connection.createStatement();
		System.out.println("platform created........");
		/*
		 * Delete single row
		 */		
		//statement.executeUpdate("delete from emp where empid = 102");
		System.out.println("delete query executed.....");
		
		//delete multiple rows
//		statement.executeUpdate("delete from emp where esal = 200000");
	}
}
