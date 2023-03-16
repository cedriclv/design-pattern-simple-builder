package com.designPattern.Builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designPattern.Builder.controller.Models.Builder;
import com.designPattern.Builder.controller.Models.Car;
import com.designPattern.Builder.controller.Models.CarBuilder;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);

		CarBuilder carBuilder = new CarBuilder();
		Car myNewCar = carBuilder
			.setSeatNumber(4)
			.setWheelsNumber(4)
			.build();
			
		myNewCar.describe();
	}

}
