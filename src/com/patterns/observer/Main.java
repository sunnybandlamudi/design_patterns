package com.patterns.observer;

public class Main {

    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();

        ObserverImpl observerA = new ObserverImpl(observable);
        observerA.setName("A");

        ObserverImpl observerB = new ObserverImpl(observable);
        observerB.setName("B");

        // This can be done inside observer class
        observable.register(observerA);
        observable.register(observerB);

        observable.doSomething();
    }
}
