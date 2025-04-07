package com.acessspeci.specifier.internal;

public class FoodStalls {
    public FoodStalls(){
        System.out.println("Running Food Stalls const");
    }
    public void fooddisp(){
        System.out.println("Running fooddisp method for calling public and default specifiers");
        Beach beach=new Beach();
        beach.Beach_Gate();
        beach.Changing_Rooms();
    }
}
