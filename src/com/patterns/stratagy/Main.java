package com.patterns.stratagy;

public class Main {
    public static void main(String[] args) {

        MountainDuck mountainDuck = new MountainDuck();
        mountainDuck.addWalk(new WalkImpl());
        mountainDuck.addFly(new FlyImpl());

        mountainDuck.actions();

    }
}
