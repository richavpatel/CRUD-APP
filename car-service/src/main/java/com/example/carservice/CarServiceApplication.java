package com.example.carservice;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.stream.Stream;

@SpringBootApplication
public class CarServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}


	@Bean
	ApplicationRunner init(CarRepository repository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
						Car car = new Car();

						car.setName(name);
				repository.save(car);
					});
			repository.findAll().forEach(System.out::println);

		};
	}

}

