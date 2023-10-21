package com.example.db_boot_two.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.db_boot_two.entity.Employee;
import com.example.db_boot_two.repo.EmployeeRepo;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    // get all employee
    public List<Employee> getAll() {
        return repo.findAll();
    }

    // get employe by id
    public Optional<Employee> getEmployeeById(int id) {
        return repo.findById(id);
    }

    // create employee
    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    // delete employee
    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "SUCCESS";
    }

    // update employee
    public Employee updateEmployee(int id, Employee employee) {
        Optional<Employee> validID = repo.findById(id);
        return repo.save(employee);

    }
}
