package com.acessspeci.specifier.internal;

public class Powder {
    public Powder(){
        System.out.println("Running no-arg Powder const");
    }
    public void Fragrance(){
        System.out.println("Running Fragrance public method");
    }
    void Texture(){
        System.out.println("Running Texture default package");
    }
    private void Container(){
        System.out.println("Running Container private method");
    }
}
