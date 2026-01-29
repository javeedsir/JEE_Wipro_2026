package jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStmtSelect {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		String selectQuery = "select * from dept";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString("dname"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
