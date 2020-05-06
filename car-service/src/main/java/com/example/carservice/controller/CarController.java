package com.example.carservice.controller;


import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService carService;


    @GetMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")

    public List<Car> getAllCar(){
        return carService.getAllCar();
    }
}
