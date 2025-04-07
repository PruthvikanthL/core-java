package com.acessspeci.specifier.internal;

public class MaterialType {
    public MaterialType(){
        System.out.println("Running Material Type const");
    }
    public void matdisp(){
        System.out.println("Running matdips method and accessing public and default package");
        Coin coin=new Coin();
        coin.back_side();
        coin.front_side();
    }
}
