package com.wipro.layers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.layers.dao.IEmployeeDao;
import com.wipro.layers.entity.Employee;

@Service
public class EmployeeServiceImp   implements IEmployeeService{

	@Autowired
	IEmployeeDao dao;
	
	
	@Override
	public boolean addEmp(Employee emp) {
		
		System.out.println(dao);


		return  dao.addEmp(emp);
	}

}
