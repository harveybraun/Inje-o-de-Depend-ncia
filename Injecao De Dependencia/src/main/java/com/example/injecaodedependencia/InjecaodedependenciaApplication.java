package com.example.injecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjecaodedependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(InjecaodedependenciaApplication.class, args);
		Pet animal = applicationContext.getBean(Pet.class);
		animal.execute();

		/*
		// Primeira Maneira
		Pet pet = new Pet();
		Pet pet = new Pet();
		pet.execute();
		*/

		/*
		// Segunda Maneira
		pet = new Pet(new Cat());
		pet.execute();
		*/


	}

}
