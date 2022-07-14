package com.patterns.factory;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}
