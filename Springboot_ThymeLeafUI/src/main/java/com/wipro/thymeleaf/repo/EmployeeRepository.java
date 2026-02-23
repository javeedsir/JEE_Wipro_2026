package com.wipro.thymeleaf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.thymeleaf.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}