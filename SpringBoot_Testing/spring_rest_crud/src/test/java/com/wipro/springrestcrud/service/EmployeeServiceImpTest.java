package com.wipro.springrestcrud.service;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.springrestcrud.dto.EmployeeDTO;
import com.wipro.springrestcrud.entity.Employee;


@SpringBootTest
class EmployeeServiceImpTest {
	
	@Autowired
	IEmployeeService service;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddEmp() {

			EmployeeDTO  dto = new EmployeeDTO(103, "Rahul", 9000);
		
		Employee emp =	service.addEmp(dto);
		
		out.print("add() tested...");
		
				assertNotNull(emp);
		

	}

	@Test
	void testGetByEid() {

		Employee emp =	service.getByEid(103);
		
			assertEquals(9000.0, emp.getSalary());
		
		

	}

	@Test
	void testGetAllSorted() {
		
		
		List<Employee>  list =		service.getAllSorted();
		
			   assertNotNull(list);
			   
			   assertTrue(list.size() > 0);
		
			   	

	}

}
