package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared_statement_Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps","root","SaiVarshith@03");
		PreparedStatement ps=c.prepareStatement("update emp set ename=? , esal=? where eid=?");
		System.out.println("Enter the eid:");
		int id=sc.nextInt();
		System.out.println("different name :");
		sc.nextLine();
		String s1 = sc.nextLine();
		
		System.out.println("Enter the updated sal");
		double sal = sc.nextDouble();
		ps.setInt(3, id);
		ps.setString(1, s1);
		ps.setDouble(2, sal);
		ps.execute();
		System.out.println("excuted..........");
		
	}
	
}
