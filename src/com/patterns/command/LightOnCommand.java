package com.patterns.command;

public class LightOnCommand implements Icommand{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
