package com.patterns.stratagy.sorting;

public class Main {
    public static void main(String[] args) {
        SortingImpl sorting = new SortingImpl();
        sorting.addStratagy(new QuickSort());
        sorting.action();

        sorting.addStratagy(new BubbleSort());
        sorting.action();
    }
}
