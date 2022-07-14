package com.patterns.stratagy.sorting;

public class SortingImpl {
    Isorting isorting;

    void addStratagy(Isorting isorting){
        this.isorting = isorting;
    }

    void action(){
        isorting.sort();
    }
}
