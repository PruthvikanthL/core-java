package com.acessspeci.specifier.internal;

public class Wildlife {
    public Wildlife(){
        System.out.println("Runnning wildlife no-arg const");
    }
    public void wilddisp(){
        System.out.println("Running wilddisp method and accesing public and default package");
        Forest forest=new Forest();
        forest.soundsofnature();
        forest.Trees();
    }
}
