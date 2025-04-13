package com.inheritance.overriding.internal;

public class ProPrinter extends Printer{
    public ProPrinter(){
        System.out.println("Running the ProPrinter const");
    }
    public void prishow(Printer printer){
        if(printer!=null){
            printer.useprinter();
            if(printer instanceof MaxPrinter){
                MaxPrinter pri=(MaxPrinter) printer;
                pri.useprinter();
            }
            else{
                System.out.println("ijn Printer Maxprinter not found");
            }
        }else{
            System.out.println("printer is null");
        }
    }
}
