package com.example.dockerwebapp.repository;

import com.example.dockerwebapp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
