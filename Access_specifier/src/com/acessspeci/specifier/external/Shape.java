package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Comb;

public class Shape {
    public Shape(){

    }
    public void Shapedisp(){
        System.out.println("Running no-arg Shape method accessing public method");
        Comb comb=new Comb();
        comb.teeth();
    }
}
