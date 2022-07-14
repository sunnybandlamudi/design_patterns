package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObservable{

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {

        for(IObserver observer :observers){
            try {
                observer.update();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void remove(IObserver observer) {

    }

    public void doSomething(){
        notifyObservers();
    }
}
