package com.example.injecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Descreve a Classe InjecaodedependenciaApplication
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 23:00
 */
@SpringBootApplication
public class InjecaodedependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(InjecaodedependenciaApplication.class, args);
		Pet animal = applicationContext.getBean(Pet.class);
		animal.execute();

		/*
		// Primeira Maneira
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
