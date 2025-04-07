package com.acessspeci.specifier.internal;

public class RemoteController {
    public RemoteController(){
        System.out.println("Running Remote Controller const");
    }
    public void remotedisp(){
        System.out.println("Running Remote Controller method accesing public and default package");
        Drone drone=new Drone();
        drone.cameramodule();
        drone.Propellers();
    }
}
