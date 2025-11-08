package com.emp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.emp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	Optional<Employee> findByEmail(String email);

	Optional<Employee> findByMobile(String mobile);

	Iterable<Employee> findByDepartment(String department);

	Iterable<Employee> findByEmailOrMobile(String email, String mobile);
}
