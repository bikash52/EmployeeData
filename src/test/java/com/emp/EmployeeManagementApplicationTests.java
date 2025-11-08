package com.emp;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

@SpringBootTest
class EmployeeManagementApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void saveEmp() {
		Employee e = new Employee();
		e.setName("Mukesh");
		e.setEmail("mukesh@gmail.com");
		e.setMobile("6366087924");
		e.setDepartment("HR");
		e.setSalary(29000);
		employeeRepository.save(e);
	}

	@Test
	void getEmp() {
		Optional<Employee> e = employeeRepository.findById(3L);
		if (e.isPresent()) {
			Employee f = e.get();
			System.out.println(f.getId());
			System.out.println(f.getName());
			System.out.println(f.getEmail());
			System.out.println(f.getMobile());
			System.out.println(f.getDepartment());
			System.out.println(f.getSalary());
		} else {
			System.out.println("No record found");
		}
	}

	@Test
	void updateEmp() {
		Optional<Employee> u = employeeRepository.findById(3L);
		if (u.isPresent()) {
			Employee l = u.get();
			l.setDepartment("QA Automation");
			employeeRepository.save(l);
		} else {
			System.out.println("No record found");
		}
	}
	
	@Test
	void deleteEmp() {
		employeeRepository.deleteById(4L);
	}

}
