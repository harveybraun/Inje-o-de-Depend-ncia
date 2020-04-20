package com.example.injecaodedependencia.model;

import com.example.injecaodedependencia.interfaces.IAnimal;
import org.springframework.stereotype.Component;

/**
 * Descreve a Classe Cat
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 23:00
 */
@Component
public class Cat implements IAnimal {
	@Override
	public void comunicar() {
		System.out.println("Miau!");
	}
}
