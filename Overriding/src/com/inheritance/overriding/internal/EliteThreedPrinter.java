package com.inheritance.overriding.internal;

public class EliteThreedPrinter extends ThreedPrinter {
    public EliteThreedPrinter(){
        System.out.println("Running the EliteThreedPrinter const");

    }
    @Override
    public void usethreedprinter(){
        System.out.println("Running the usethreedprinter method in the subclass");
    }
    public void mainthreedprinter(){
        System.out.println("Running the mainthreedprinter in the subclass");
    }
}
