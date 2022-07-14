package com.patterns.command;

public class Light {

    String color = "white";

    public Light(){

    }

    public Light(String color){
        this.color = color;
    }

    void on(){
        System.out.println("Lights On " + color);
    }

    void off(){
        System.out.println("Lights Off "+ color);
    }
}
