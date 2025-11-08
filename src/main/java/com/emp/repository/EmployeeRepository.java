package com.emp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.emp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query("Select e from Employee e where e.email=:x")
	Employee findByEmail(@Param("x") String email);

	Optional<Employee> findByMobile(String mobile);

	Iterable<Employee> findByDepartment(String department);

	@Query("Select e from Employee e where e.email=:x or e.mobile=:y")
	List<Employee> findByEmailOrMobile(@Param("x") String email, @Param("y") String mobile);
}
