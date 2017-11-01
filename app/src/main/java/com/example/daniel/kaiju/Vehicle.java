package com.example.daniel.kaiju;

/**
 * Created by Daniel on 01/11/2017.
 */

public abstract class Vehicle {

    String type;
    double healthValue;

    public Vehicle(String type, double healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return this.type;
    }

    public double getHealthValue() {
        return this.healthValue;
    }
}


//        Give the Kaiju an 'attack' method which can be used to damage vehicles.
//
//        Give the Kaiju a 'move'/'fly' method, which returns a string (depending on the Kaiju).