package com.demo.uppgifter.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IAnimal> animal = new ArrayList();
        Bird bird = new Bird("koltrast", 2);
        Dog dog = new Dog("Pitbull", 3);
        animal.add(bird);
        animal.add(dog);

        for (IAnimal i : animal){
            System.out.println(i);
        }
    }
}
