package com.wipro.springrestcrud.service;

import java.util.List;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;

public interface IEmployeeService {
	
	
		public  Employee   addEmp(EmployeeDTO emp);
		public  Employee   updateEmp(EmployeeDTO emp);
		
		public  List<Employee>    getAllEmployees();
		
		public   Employee   getByEid(int eid);
		public    String    deleteByEid(int eid);

}
