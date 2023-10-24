package com.example.db_boot_two.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.db_boot_two.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, String> {

}
