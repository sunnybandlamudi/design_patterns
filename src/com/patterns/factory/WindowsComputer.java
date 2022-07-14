package com.patterns.factory;

public class WindowsComputer implements LaptopFactoryObjects {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Keyboard createKeyboard() {
        return new WindowKeyboard();
    }
}
