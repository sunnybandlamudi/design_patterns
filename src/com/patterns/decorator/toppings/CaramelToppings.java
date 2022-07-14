package com.patterns.decorator.toppings;

import com.patterns.decorator.IBevarage;

public class CaramelToppings extends ToppingsDecorator {

    IBevarage iBevarage;

    public CaramelToppings(IBevarage iBevarage){
        this.iBevarage = iBevarage;
    }

    @Override
    public void getDesc() {

    }

    @Override
    public int cost() {
        return this.iBevarage.cost() + 20;
    }
}
