package jdbc_steps;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Callable_Statement_Insertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps","root","SaiVarshith@03");
		CallableStatement cst = c.prepareCall("insert into emp values(?,?,?);");
		cst.setInt(1, 111);
		cst.setString(2, "venkat");
		cst.setDouble(3, 50000);
		cst.execute();
		System.out.println("inserted......");
		
		
	}
}
