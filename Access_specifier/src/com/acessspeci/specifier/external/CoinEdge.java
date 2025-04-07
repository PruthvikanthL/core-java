package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Coin;

public class CoinEdge {
    public CoinEdge(){
        System.out.println("Running external Coindedge class");
    }
    public void coindisp(){
        System.out.println("Running Coinedge class accesing public method from external package");
        Coin coin=new Coin();
        coin.front_side();
    }
}
