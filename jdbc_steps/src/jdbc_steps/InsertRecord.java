package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded.......");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "SaiVarshith@03");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps", "root", "SaiVarshith@03");
			Statement st = con.createStatement();
//			boolean b =st.execute("insert into emp values (105,'ravan', 20000)");
			int a=st.executeUpdate("insert into emp values (106,'Bharath', 30000), (107, 'Bali',25000)");
			
			/* executeUpdate() is a specialized method that is used to execute only "DML query".
			 * If nay other type of query is executed then it gives SQLException
			 *  
			 *  */

//			System.out.println(b);
			System.out.println(a);
			System.out.println("inserted......");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
