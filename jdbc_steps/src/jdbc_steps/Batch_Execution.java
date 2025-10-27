package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_Execution {
	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement pS=null;
//		String q1 = "insert into emp values(900,'Shankar',20000)";
		String q2 = "update emp set ename ='sharma' where ename = '?'";
		String q3 = "delete from emp where ename ='?'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps","root", "SaiVarshith@03");
			pS = con.prepareStatement(q2);
			pS.setString(1, "Vijay");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
