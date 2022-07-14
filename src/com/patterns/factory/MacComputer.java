package com.patterns.factory;

public class MacComputer implements LaptopFactoryObjects {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }
}
