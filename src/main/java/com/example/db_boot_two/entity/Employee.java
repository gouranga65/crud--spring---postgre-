package com.example.db_boot_two.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
    @Id
    @GeneratedValue(generator = "empl_gen", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "empl_gen", sequenceName = "Employee_gen", initialValue = 0, allocationSize = 0)
    private int id;
    private String name;
    private String address;
    private String branch;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String address, String branch, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", branch=" + branch + ", salary="
                + salary + "]";
    }

}
