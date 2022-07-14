package com.patterns.factory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
