package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Longevity;

public class Portability {
    public Portability(){
        System.out.println("Running no-arg Portability const");
    }
    public void Portdip(){
        System.out.println("Running Portability const from external package");
        Longevity longevity=new Longevity();
        longevity.longedisp();
    }
}
