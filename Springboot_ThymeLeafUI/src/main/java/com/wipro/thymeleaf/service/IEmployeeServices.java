package com.wipro.thymeleaf.service;

import java.util.List;

import com.wipro.thymeleaf.entity.Employee;

public interface IEmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
