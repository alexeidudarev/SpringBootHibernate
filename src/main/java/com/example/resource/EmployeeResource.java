package com.example.resource;

import com.example.entities.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class EmployeeResource {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}
