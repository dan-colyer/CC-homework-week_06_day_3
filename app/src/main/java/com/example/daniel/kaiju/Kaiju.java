package com.example.daniel.kaiju;

/**
 * Created by Daniel on 01/11/2017.
 */

public abstract class Kaiju {

    String name;
    double healthValue;
    double attackValue;

    public Kaiju(String name, double healthValue, double attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }
}

//    Using TDD, abstract classes and interfaces where appropriate, model the following;
//
//        Using a 'Kaiju' abstract class, create two giant lizards to run amok in Tokyo. Parameters for each Kaiju should include; 'name', 'healthValue' and 'attackValue'. Give the Kaiju a 'roar' method which returns a string.
//
//        Using a 'Vehicle' abstract class, create two Army vehicles to battle the Kaiju. Parameters should include; 'type' and 'healthvalue'.
//
//        Give the Kaiju an 'attack' method which can be used to damage vehicles.
//
//        Give the Kaiju a 'move'/'fly' method, which returns a string (depending on the Kaiju).