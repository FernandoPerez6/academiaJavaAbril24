package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);
    
    List<Employee> findByFirstName(String firstName);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
