package com.example.dockerwebapp.service;

import com.example.dockerwebapp.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAll();
}
