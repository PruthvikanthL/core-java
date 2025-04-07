package com.acessspeci.specifier.internal;

public class SkinFreshness {
    public SkinFreshness(){
        System.out.println("Running no-arg Skin Freshness const");
    }
    public void skindisp(){
        System.out.println("Running skindisp method accesing public and default package ");
        Powder powder=new Powder();
        powder.Fragrance();
        powder.Texture();
    }
}
