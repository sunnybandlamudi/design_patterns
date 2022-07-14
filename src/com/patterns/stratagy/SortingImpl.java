package com.patterns.stratagy;

import com.patterns.stratagy.sorting.Isorting;

public class SortingImpl {
    Isorting isorting;

    void addStratagy(Isorting isorting){
        this.isorting = isorting;
    }
}
