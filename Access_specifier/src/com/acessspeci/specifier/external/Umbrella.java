package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Beach;

public class Umbrella {
    public Umbrella(){
        System.out.println("Running Umbrella external class");
    }
    public void beachdisp(){
        System.out.println("Running beachdisp method and calling public method");
        Beach beach=new Beach();
        beach.Beach_Gate();
    }
}
