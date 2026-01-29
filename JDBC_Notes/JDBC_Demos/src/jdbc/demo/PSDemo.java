package jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		//String insertQuery = " insert into Dept values(?,?,?) "; // ? --> positional parameter
		
		//String updateQuery = "update Dept set  dname = ?  ,  location = ?  where dno = ?";
		
		String deleteQuery = "delete from Dept where dno = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
				// insert query
			/*
			 * pstmt.setInt(1, 70); pstmt.setString(2, "Operation"); pstmt.setString(3,
			 * "Pune");
			 */
			// update query
			/*
			 * pstmt.setString(1,"Research"); pstmt.setString(2,"Mumbai"); pstmt.setInt(3,
			 * 70);
			 */
			
					pstmt.setInt(1, 70);

			int count = pstmt.executeUpdate();
			
			System.out.println(count +" record effected...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
