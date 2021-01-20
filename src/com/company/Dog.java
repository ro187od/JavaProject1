package com.company;

public class Dog  extends Animal{
    String breed = "Сur";

    public Dog(String name, int weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }

    public void woof(){
        System.out.println("Woof");
    }
}
