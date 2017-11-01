package com.example.daniel.kaiju;

/**
 * Created by Daniel on 01/11/2017.
 */

public class PygmyHippo extends Kaiju implements Roar {

    public PygmyHippo(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Meep";
    }
}

//    public Dragon(String name){
//        super(name);