package com.patterns.stratagy;

public class Duck {
    IWalk walk;
    IFly fly;

    void addWalk(IWalk walk){
        this.walk = walk;
    }

    void addFly(IFly fly){
        this.fly = fly;
    }

    void actions(){
        if(walk != null){
            walk.walk();
        }
        if(fly != null){
            fly.fly();
        }
    }
}
