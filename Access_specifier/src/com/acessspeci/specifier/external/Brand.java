package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Card;

public class Brand {
    public Brand(){
        System.out.println("Running Brand  const from extranal package");
    }
    public void branddisp(){
        System.out.println("Running branddisp method and accesing public method");
        Card card=new Card();
        card.cardnumber();
    }
}
