package com.example.db_boot_two.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.db_boot_two.entity.Employee;
import com.example.db_boot_two.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/all/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @DeleteMapping("/deleteEmpl/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return service.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @GetMapping("/wallah/{name}")
    public List<Employee> getByname(@PathVariable("name") String name) {
        return service.findEmplWithName(name);
    }
}
