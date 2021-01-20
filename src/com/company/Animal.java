package com.company;

public class Animal {
    String name = "Default";
    int weight = 0;

    public Animal(String name , int  weight){
        this.name = name;
        this.weight = weight;
    }

    public void go(){
        System.out.println(name + " go");
    }
}
