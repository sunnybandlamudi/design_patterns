package com.patterns.factory;

public class Laptop {
    Button button;
    Keyboard keyboard;

    public Laptop(LaptopFactoryObjects factoryObjects){
        this.button = factoryObjects.createButton();
        this.keyboard = factoryObjects.createKeyboard();
    }

    void check(){
        this.button.click();
        this.keyboard.keyboard();
    }
}
