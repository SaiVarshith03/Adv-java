package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "SaiVarshith@03");
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(102,'Laxman', 200000), (105,'Ravan', 200000),(103,'sita', 200000)");
			System.out.println("inserted.......");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
