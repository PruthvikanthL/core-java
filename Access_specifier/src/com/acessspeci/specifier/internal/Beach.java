package com.acessspeci.specifier.internal;

public class Beach {
    public Beach(){
        System.out.println("Running no-arg Beach const");
    }
    public void Beach_Gate(){
        System.out.println("Running Beach_Gate public method");
    }
    void Changing_Rooms(){
        System.out.println("Running Changing_Rooms default package method");
    }
    private void Shower_Area(){
        System.out.println("Running showerarea private method");
    }
}
