package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Wildlife;
import sun.security.provider.Sun;

public class Sunlight {
    public Sunlight(){
        System.out.println("Running Sunlight const from extranal package");
    }
    public void sundisp(){
        System.out.println("Running sundisp method from external package and accessing public method");
        Wildlife wildlife=new Wildlife();
        wildlife.wilddisp();
    }
}
