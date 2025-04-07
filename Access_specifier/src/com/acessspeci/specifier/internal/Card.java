package com.acessspeci.specifier.internal;

public class Card {
    public Card(){
        System.out.println("Running card no-arg const");
    }
    public void cardnumber(){
        System.out.println("Running cardnumber public method ");
    }
    void cardhholdername(){
        System.out.println("Running cardholdername default package method");

    }
    private void expirydate(){
        System.out.println("Running Expirydate private method");
    }
}
