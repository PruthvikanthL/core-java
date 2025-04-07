package com.acessspeci.specifier.internal;

public class Comb {
    public Comb(){
        System.out.println("Running no-arg Comb const");
    }
    public void teeth(){
        System.out.println("Running Teeth  public method");
    }
    void Handle(){
        System.out.println("Running Handle default package method");
    }
    private void Material(){
        System.out.println("Running Material private method");
    }
}
