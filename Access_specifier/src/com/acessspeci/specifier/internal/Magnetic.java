package com.acessspeci.specifier.internal;

public class Magnetic {
    public Magnetic(){
        System.out.println("Running Magnetic no-arg const");
    }
    public void magdisp(){
        System.out.println("Running magdisp method and accessing public and defualt package method ");
        Card card=new Card();
        card.cardhholdername();
        card.cardnumber();
    }
}
