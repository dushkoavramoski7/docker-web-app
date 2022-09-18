package com.example.dockerwebapp.service;

import com.example.dockerwebapp.model.Car;
import com.example.dockerwebapp.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService{
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        List<Car> cars = this.carRepository.findAll();
        return  cars;
    }
}
