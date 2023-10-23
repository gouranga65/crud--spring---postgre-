package com.example.db_boot_two.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.db_boot_two.entity.Employee;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    List<Employee> findByName(String name);
    // public List<Employee> findByName(String name);

}
