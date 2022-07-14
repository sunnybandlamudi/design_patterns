package com.patterns.command;

public class LightOffCommand implements Icommand{

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }


}
