package com.company;

public class Main {

    public static void main(String[] args) {
        Animal pony = new Animal("Pony", 13);
        pony.go();
        BengalCat maydan = new BengalCat("Maydan", 1, "kitekat", true);
        maydan.sleep_hours(8);
        Dog muhtar = new Dog("Muhtar", 11, "Sheepdog");
        muhtar.woof();
        BengalDog trans = new BengalDog("Trans", 10, "Sheepdog", false);
        trans.info();
    }
}
