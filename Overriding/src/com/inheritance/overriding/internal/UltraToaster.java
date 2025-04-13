package com.inheritance.overriding.internal;

public class UltraToaster extends Toaster{
    public UltraToaster(){
        System.out.println("Running the UltraToaster const");
    }
    public void showtoster(Toaster toaster){
        if(toaster!=null){
            toaster.usetoaster();
            if(toaster instanceof ProToaster){
                ProToaster toast=(ProToaster) toaster;
                toast.maintoster();
            }
            else{
                System.out.println("in Toaster Protoaster is not foung");
            }
        }else{
            System.out.println("Toaster is null");
        }
    }
}
