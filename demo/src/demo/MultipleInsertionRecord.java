package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleInsertionRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","SaiVarshith@03");
		Statement statement = connection.createStatement();
		statement.executeUpdate("insert into emp values(106,'Laxman', 200000), (107,'Ravan', 200000),(108,'sita', 200000)");
		System.out.println("multiple records inserted..........");
		
	}
}
