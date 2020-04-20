package com.example.injecaodedependencia.model;

import com.example.injecaodedependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("MyDog")
public class Dog implements IAnimal {
    @Override
    public void comunicar() {
        System.out.println("Au!");
    }
}
