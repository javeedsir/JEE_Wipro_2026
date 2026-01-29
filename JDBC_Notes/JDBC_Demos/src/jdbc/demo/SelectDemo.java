package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");

			Statement stmt = conn.createStatement();
			
			String query = "select * from Dept";
			
		ResultSet rs =	stmt.executeQuery(query);
		
					while(rs.next()) {
						
					int dno =	rs.getInt("dno");
					String location =rs.getString("location");
					String dname = rs.getString("dname");
				
				System.out.println(dno +" "+  dname +" "+location);
						
					}
					
					
					
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
