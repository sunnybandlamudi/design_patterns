package com.patterns.observer;

public interface IObservable {
    public void register(IObserver observer);
    public void notifyObservers();
    public void remove(IObserver observer);
}
