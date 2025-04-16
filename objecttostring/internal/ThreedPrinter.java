package com.inheritance.overriding.internal;

public class ThreedPrinter {
    private  String model;
    private  double printSpeed;

    public ThreedPrinter(String model, double printSpeed) {
        System.out.println("Running the ThreedPrinter const");
        this.model = model;
        this.printSpeed = printSpeed;
    }

    @Override
    public String toString() {
        return model + " " + printSpeed;
    }

    public void printerdisp() {
        System.out.println("Model: " + this.model + ", Print Speed: " + this.printSpeed + " mm/s");
    }

//    public void usethreedprinter() {
//        System.out.println("Running the ThreedPrinter method in the parent class");
//    }
}
