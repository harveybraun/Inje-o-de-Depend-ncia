package com.example.injecaodedependencia.model;

import com.example.injecaodedependencia.interfaces.IAnimal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements IAnimal {
    @Override
    public void comunicar() {
        System.out.println("Miau!");
    }
}
