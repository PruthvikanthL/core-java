package com.acessspeci.specifier.internal;

public class PrasadaCounter {
//    Temple temple=new Temple();
    public PrasadaCounter(){
        System.out.println("Running Prasadcounter const");
    }
    public void Tempdisp(){
        System.out.println("accessing public and defualt access specifiers from internal package");
        Temple temple=new Temple();
        temple.darshan_hall();
        temple.ticket_counter();

    }
}
