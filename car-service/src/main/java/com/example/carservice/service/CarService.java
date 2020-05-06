package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCar() {
        return carRepository.findAll();

    }
}
