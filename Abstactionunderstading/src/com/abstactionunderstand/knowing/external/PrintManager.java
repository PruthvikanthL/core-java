package com.abstactionunderstand.knowing.external;

public class PrintManager {
    Printer printer;
    public PrintManager(Printer printer){
        this.printer=printer;
    }
    public void chooseprinter(){
        if(this.printer!=null){
            this.printer.ink();
        }
        else{
            System.out.println("sorry printer is null");
        }
    }
}
