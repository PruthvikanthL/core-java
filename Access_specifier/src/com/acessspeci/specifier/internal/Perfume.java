package com.acessspeci.specifier.internal;

public class Perfume {
    public Perfume(){
        System.out.println("Running Perfume no-arg const");
    }
    public void Fragrance(){
        System.out.println("Running Fragrance public method");
    }
    void bottledesign(){
        System.out.println("Running Bottle Design default package method");
    }
    private void spraynozzle(){
        System.out.println("Running Spray Nozzle private method");
    }
}
