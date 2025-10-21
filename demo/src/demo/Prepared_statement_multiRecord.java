package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared_statement_multiRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1?user =root && password = SaiVarshith@03");
		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=2;i++) {
			System.out.println("Enter the eid:");
			int id = sc.nextInt();
			System.out.println("Enter the ename");
			sc.nextLine();
			String s = sc.nextLine();
			System.out.println("Enter the esal:");
			double sal = sc.nextDouble();
			ps.setInt(1, id);
			ps.setString(2, s);
			ps.setDouble(3, sal);
			ps.execute();
		}
		System.out.println("data added");
	}
}
