package com.company;

public class BengalDog extends Dog{
    boolean booth = false;
    public BengalDog(String name, int weight, String breed, boolean booth) {
        super(name, weight, breed);
        this.booth = booth;
    }
    public void info(){
        System.out.println(name + " " + weight + " " + breed + " " + booth);
    }
}
