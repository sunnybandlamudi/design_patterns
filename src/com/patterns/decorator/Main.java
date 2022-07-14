package com.patterns.decorator;

import com.patterns.decorator.toppings.CaramelToppings;
import com.patterns.decorator.toppings.ChocklateTopping;

public class Main {
    public static void main(String[] args) {

        IBevarage iBevarage =  new ChocklateTopping(new CaramelToppings(new CoffeeBevarage()));
        System.out.println(iBevarage.cost());
    }
}
