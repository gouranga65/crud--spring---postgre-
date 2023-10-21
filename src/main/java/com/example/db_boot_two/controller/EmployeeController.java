package com.example.db_boot_two.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
