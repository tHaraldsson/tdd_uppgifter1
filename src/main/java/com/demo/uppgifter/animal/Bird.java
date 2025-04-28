package com.demo.uppgifter.animal;

public class Bird implements IAnimal {
    private String birdName;
    private int birdAge;

    public Bird(String birdName, int birdAge) {
        this.birdName = birdName;
        this.birdAge = birdAge;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                ", birdAge=" + birdAge +
                '}';
    }
}
