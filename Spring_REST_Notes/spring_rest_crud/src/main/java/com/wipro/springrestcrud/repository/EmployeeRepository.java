package com.wipro.springrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springrestcrud.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}
