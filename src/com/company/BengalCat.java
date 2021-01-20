package com.company;

public class BengalCat extends Cat{
    boolean master = false;
    int hours = 6;
    String feed = "Whiskas";
    public BengalCat(String name, int weight, String feed, boolean b) {
        super(name, weight);
        this.feed = feed;
    }

    public void sleep_hours(int hours){
        this.hours = hours;
        System.out.println(name + " eating and sleep " + hours + "hours.");
    }
}
