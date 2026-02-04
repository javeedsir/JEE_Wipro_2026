package com.wipro.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.pms.pojo.Product;

public class ProductDaoImp   implements IProductDao{

	@Override
	public int addProduct(Product p) {
		
		
			Connection conn =		DBUtil.getDBConnection();
			
			int count = 0;
			
			String insertQuery = "insert into Products values(?,?,?)";
		
				try {
					PreparedStatement pstmt = conn.prepareStatement(insertQuery);
					
						pstmt.setInt(1,p.getPid());
						pstmt.setString(2, p.getPname());
						pstmt.setDouble(3, p.getPrice());
						
					count =	pstmt.executeUpdate();
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
	
	
	
			
			return count;
	}

}
