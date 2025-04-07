package com.acessspeci.specifier.internal;

public class Coin {
    public Coin(){
        System.out.println("Running no-arg coin const");
    }
    public void front_side(){
        System.out.println("Running front_side public method");
    }
    void back_side(){
        System.out.println("Running back_side default package");
    }
    private void coin_value(){
        System.out.println("Running private Coin value method");
    }
}
