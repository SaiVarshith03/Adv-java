package jdbc_steps;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared_Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps", "root", "SaiVarshith@03");
			PreparedStatement ps = connection.prepareStatement("insert into emp values (?,?,?);");
			System.out.println("query..........");
			ps.setInt(1, 108);
			ps.setString(2, "Sai Varshith");
			ps.setDouble(3, 300000);
			//ps.execute();
			ps.setInt(1, 109);
			ps.setString(2, "Vijay");
			ps.setDouble(3, 300000);
			ps.execute();
			System.out.println("executed.......");`			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	}

}
