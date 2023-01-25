package com.wc.workoutcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutCalculatorApplication {

	/*
	TODO
	index -> input form (biological gender, height, mass, body type)
	processing -> guessing of excessive fat (1kg = 7900 - 9000kcal) and splitting it into
		reasonable (3kg fat loss per month) daily workouts
	results -> visualizing the needed effort and exporting it as a pdf
	 */

	public static void main(String[] args) {
		SpringApplication.run(WorkoutCalculatorApplication.class, args);
	}

}
