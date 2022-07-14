package com.patterns.adapter;

public class Adapter implements IAdpater{

    Adaptee iAdaptee;

    public Adapter(Adaptee iAdaptee){
        this.iAdaptee = iAdaptee;
    }

    @Override
    public void request() {
        iAdaptee.specficRequest();
    }
}
