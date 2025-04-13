package com.inheritance.overriding.internal;

public class ProMicrowave extends Microwave{
    public ProMicrowave(){
        System.out.println("Running the proMicrowave const");
    }
    public void microshow(Microwave microwave){
        if(microwave!=null){
            microwave.usemicrowave();
            if(microwave instanceof UltraMicrowave){
                UltraMicrowave micro=(UltraMicrowave) microwave;
                micro.usemicrowave();
            }
            else{
                System.out.println("in microshow ultramicroshow not found");
            }}
            else{
                System.out.println("microwave is  null");
            }

    }
}
