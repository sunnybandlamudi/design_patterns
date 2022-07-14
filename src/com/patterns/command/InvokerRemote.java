package com.patterns.command;

public class InvokerRemote {

    Icommand on;
    Icommand off;

    InvokerRemote(Icommand on, Icommand off){
        this.on = on;
        this.off = off;
    }

    void on(){
        on.execute();
    }

    void off(){
        off.execute();
    }

}
