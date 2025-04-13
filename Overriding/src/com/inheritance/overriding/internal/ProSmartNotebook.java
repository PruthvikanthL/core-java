package com.inheritance.overriding.internal;

public class ProSmartNotebook extends SmartNotebook{
    public ProSmartNotebook(){
        System.out.println("Running the ProSmartNotebook const");
    }
    public void shownote(SmartNotebook smartNotebook){
        if(smartNotebook!=null){
            smartNotebook.usesmart();
            if(smartNotebook instanceof UltraSmartNotebook){
                UltraSmartNotebook book=(UltraSmartNotebook) smartNotebook;
                book.mainsmart();
            }else {
                System.out.println("in smartnotebook UltraSmartNotebook is not found");
            }
        } else{
            System.out.println("smartnotebook is null");
        }

}}
