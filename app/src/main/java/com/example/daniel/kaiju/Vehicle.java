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

    public void reduceHealth(double attackValue) {
        this.healthValue -= attackValue;
    }
}

