package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class TableCreation {
	public static void  main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class is loaded and registered");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps?user=root && password=SaiVarshith@03");
			System.out.println("Connection established");
			System.out.println(con);
			Statement stmt = con.createStatement();
			System.out.println(stmt);
			boolean b = stmt.execute("create table emp (eid int, ename varchar(40), esal double)");
			System.out.println(b);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
