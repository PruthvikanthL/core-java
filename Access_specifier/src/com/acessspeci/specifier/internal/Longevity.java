package com.acessspeci.specifier.internal;

public class Longevity {
    public Longevity(){
        System.out.println("Running no-arg Longevity const ");
    }
    public void longedisp(){
        System.out.println("Running longedisp method and accessing public and default package method");
        Perfume perfume=new Perfume();
        perfume.bottledesign();
        perfume.Fragrance();
    }
}
