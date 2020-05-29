package com.example.demo;

import com.example.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
@EnableJpaRepositories(basePackages = "com.example.repository")
@SpringBootApplication
public class SpringBootHybernateProjectApplication implements CommandLineRunner {

	@Autowired
	EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHybernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeDao.createEmployee(employee);
	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setSalary(5000.0);
		employee.setDoj(new Date());
		return employee;
	}
}
