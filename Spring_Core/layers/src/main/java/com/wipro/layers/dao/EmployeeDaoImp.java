package com.wipro.layers.dao;

import org.springframework.stereotype.Repository;

import com.wipro.layers.entity.Employee;

@Repository
public class EmployeeDaoImp implements IEmployeeDao { // Repository class

	@Override
	public boolean addEmp(Employee emp) {
		
		
		// JDBC CODE OR HIBERNATE CODE
			boolean flag = false;
			
			if(emp != null) {
				
				
				flag = true;
			}
		
			

		return flag;
	}

}
