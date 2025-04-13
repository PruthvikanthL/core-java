package com.inheritance.overriding.internal;

public class ProBarcodeScanner extends BarcodeScanner{
    public ProBarcodeScanner(){
        System.out.println("Running the ProBarcodeScanner const");
    }
    public void showbar(BarcodeScanner barcodeScanner){
        if(barcodeScanner!=null){
            barcodeScanner.usebar();
            if(barcodeScanner instanceof MaxBarcodeScanner){
                MaxBarcodeScanner bar=(MaxBarcodeScanner) barcodeScanner;
                bar.mainbar();
            }
            else{
                System.out.println("in barcodescanner MaxBarcodeScanner is not found");
            }
        }else{
            System.out.println("barcodescanner is null");
        }
    }
}
