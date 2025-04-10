package com.inheritance.overriding.internal;

public class SmartSteamMop extends SteamMop{
    public SmartSteamMop(){
        System.out.println("Running the SmartSteamMop const");
    }
    @Override
    public void usemop(){
        System.out.println("Running the usemop method in the subclass");
    }
    public void mainmop(){
        System.out.println("Running the mainmop method in the subclass");
    }
}
