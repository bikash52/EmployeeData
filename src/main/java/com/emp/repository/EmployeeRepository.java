package com.emp.repository;

import org.springframework.data.repository.CrudRepository;

import com.emp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
