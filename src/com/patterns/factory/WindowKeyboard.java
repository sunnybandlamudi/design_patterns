package com.patterns.factory;

import java.security.Key;

public class WindowKeyboard implements Keyboard {
    @Override
    public void keyboard() {
        System.out.println("Window Keyboard");
    }
}
