package com.patterns.command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light("Blue");
        InvokerRemote remote = new InvokerRemote(new LightOnCommand(light), new LightOffCommand(light));

        remote.on();
        remote.off();
    }
}
