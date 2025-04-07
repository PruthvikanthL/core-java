package com.acessspeci.specifier.internal;

public class Drone {
    public Drone(){
        System.out.println("Running no-args Drone class");
    }
    public void Propellers(){
        System.out.println("Running Propellers public method ");
    }
    void cameramodule(){
        System.out.println("Running camera module default package method");
    }
    private void batterypack(){
        System.out.println("Running private Battery Pack method");
    }
}
