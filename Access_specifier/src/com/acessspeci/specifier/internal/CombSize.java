package com.acessspeci.specifier.internal;

public class CombSize {
    public CombSize(){
        System.out.println("Running no-arg Combsize method");
    }
    public void combdisp(){
        System.out.println("Running combdisp method for accesing public and default package ");
        Comb comb=new Comb();
        comb.Handle();
        comb.teeth();
    }
}
