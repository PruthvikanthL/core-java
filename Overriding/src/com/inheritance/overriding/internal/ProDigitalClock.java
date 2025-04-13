package com.inheritance.overriding.internal;

public class ProDigitalClock extends DigitalClock{
    public ProDigitalClock(){
        System.out.println("Running the ProDigitalClock const");
    }
    public void showdigital(DigitalClock digitalClock){
        if(digitalClock!=null){
            digitalClock.usedigital();
            if(digitalClock instanceof SmartDigitalClock){
                SmartDigitalClock digi=(SmartDigitalClock) digitalClock;
                digi.maindigita();
            }
            else{
                System.out.println("in digitalclock smartdigital is not found");
            }
        }else{
            System.out.println("digitalclock is null");
        }
    }
}
