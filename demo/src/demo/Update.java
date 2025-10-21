package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded......");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "SaiVarshith@03");
			System.out.println("connected......");
			Statement st = con.createStatement();
			System.out.println("platform is created.........");
			/* 
			 * 
			 * Update single column 
			 * 
			 * */
			//st.executeUpdate("update emp set esal = 50000 where empid = 104");
			System.out.println("updated.....");
			
			/* 
			 * 
			 * Updating multiple columns 
			 * */
			st.execute("update emp set esal=100, empName='Kumbkaran' where empid=104;");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
