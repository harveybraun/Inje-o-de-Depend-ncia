package com.example.injecaodedependencia;

import com.example.injecaodedependencia.interfaces.IAnimal;
import com.example.injecaodedependencia.model.Cat;
import com.example.injecaodedependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Descreve a Classe Pet
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 23:00
 */
@Component
public class Pet {

	@Autowired
	@Qualifier("dog")
	private IAnimal iAnimal;

	/*
	// Segunda Maneira
	// Ter Construtor e Nele Injetar a Dependencia
	public Animal(IAnimal iAnimal) {
		this.iAnimal = iAnimal;
	}
	*/

	public void execute() {
		iAnimal.comunicar();
	}

	/*
	// Primeira Maneira
	// Forte Acoplamento
	public void execute() {
		iAnimal = new Cat();
		iAnimal.comunicar();
	}
	*/

}
