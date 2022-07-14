package com.patterns.observer;

public class ObserverImpl implements IObserver{

    ObservableImpl observable;
    String name;

    public ObserverImpl(ObservableImpl name){
        this.observable = name;
    }

    void setName(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Called Subscriber "+name);
        System.out.println(observable.observers);
    }
}
