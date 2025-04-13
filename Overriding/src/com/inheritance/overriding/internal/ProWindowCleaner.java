package com.inheritance.overriding.internal;

public class ProWindowCleaner extends WindowCleaner{
    public ProWindowCleaner(){
        System.out.println("Running the ProWindowCleaner const");
    }
    public void showwind(WindowCleaner windowCleaner){
        if(windowCleaner!=null){
            windowCleaner.usewindow();
            if(windowCleaner instanceof MaxWindowCleaner){
                MaxWindowCleaner max=(MaxWindowCleaner) windowCleaner;
                max.mainwindow();
            }
            else{
                System.out.println("in windowcloser MaxWindowCleaner is not found");
            }
        }else {
            System.out.println("windowcloser is null");
        }
    }
}
