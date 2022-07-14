package com.patterns.decorator.toppings;

import com.patterns.decorator.IBevarage;

public class ChocklateTopping extends ToppingsDecorator {

    IBevarage iBevarage;

    public ChocklateTopping(IBevarage iBevarage){
        this.iBevarage = iBevarage;
    }

    @Override
    public void getDesc() {

    }

    @Override
    public int cost() {
        return this.iBevarage.cost() + 15;
    }
}
