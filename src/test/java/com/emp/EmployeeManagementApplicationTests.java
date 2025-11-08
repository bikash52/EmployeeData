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

	@Test
	void getAllEmp() {
		Iterable<Employee> all = employeeRepository.findAll();
		for (Employee e : all) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getMobile());
			System.out.println(e.getDepartment());
			System.out.println(e.getSalary());
		}
	}

	@Test
	void getByEmail() {
		Optional<Employee> byEmail = employeeRepository.findByEmail("rakesh@gmail.com");
		if (byEmail.isPresent()) {
			Employee email = byEmail.get();
			System.out.println(email.getId());
			System.out.println(email.getName());
			System.out.println(email.getEmail());
			System.out.println(email.getMobile());
			System.out.println(email.getDepartment());
			System.out.println(email.getSalary());
		}
	}

	@Test
	void getByMobile() {
		Optional<Employee> byMobile = employeeRepository.findByMobile("6366487924");
		if (byMobile.isPresent()) {
			Employee mobile = byMobile.get();
			System.out.println(mobile.getId());
			System.out.println(mobile.getName());
			System.out.println(mobile.getEmail());
			System.out.println(mobile.getMobile());
			System.out.println(mobile.getDepartment());
			System.out.println(mobile.getSalary());
		}
	}

	@Test
	void getByDepartment() {
		Iterable<Employee> dep = employeeRepository.findByDepartment("IT");
		for (Employee d : dep) {
			System.out.println(d.getId());
			System.out.println(d.getName());
			System.out.println(d.getEmail());
			System.out.println(d.getMobile());
			System.out.println(d.getDepartment());
			System.out.println(d.getSalary());
		}
	}

	@Test
	void getByEmailOrMobile() {
		Iterable<Employee> byEmailOrMobile = employeeRepository.findByEmailOrMobile("rakesh@gmail.com", "6366432873");
		for (Employee e : byEmailOrMobile) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getMobile());
			System.out.println(e.getDepartment());
			System.out.println(e.getSalary());
		}
	}
}
