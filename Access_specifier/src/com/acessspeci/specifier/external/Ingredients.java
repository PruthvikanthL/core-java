package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Powder;
import com.acessspeci.specifier.internal.SkinFreshness;

public class Ingredients {
    public Ingredients(){
        System.out.println("Running Ingredients method external package");
    }
    public void ingredisp(){
        System.out.println("Running ingredisp method and accessing public method");
        SkinFreshness skinFreshness=new SkinFreshness();
        skinFreshness.skindisp();
    }
}
