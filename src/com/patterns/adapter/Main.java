package com.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        IAdpater iAdpater = new Adapter(new Adaptee());
        iAdpater.request();
    }
}
