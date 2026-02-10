package com.wipro.hibernate;

import java.util.List;

import com.wipro.hibernate.entity.Employee;

public class NamedQueryTest {

	public static void main(String[] args) {


		DaoImp dao = new DaoImp();
		
			
		Employee emp =	dao.getEmpByEid();
		
		System.out.println(emp);
		
		
	List<Employee> list =  dao.getAll();
		
		
				for (Employee e1 : list) {
					
					
						System.out.println(e1);
				}
	
	
	}

}
