package com.patterns.factory;

public class Main {
    public static void main(String[] args) {


        Laptop windowsLaptop = new Laptop(new WindowsComputer());
        windowsLaptop.check();

        Laptop macLaptop = new Laptop(new MacComputer());
        macLaptop.check();
    }



}
