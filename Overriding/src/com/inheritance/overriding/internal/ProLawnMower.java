package com.inheritance.overriding.internal;

public class ProLawnMower extends LawnMower{
    public ProLawnMower(){
        System.out.println("Running the ProLawnMower const");
    }
    public void showlawn(LawnMower lawnMower){
        if(lawnMower!=null){
            lawnMower.uselawnmover();
            if(lawnMower instanceof SmartLawnMower){
                SmartLawnMower mower=(SmartLawnMower) lawnMower;
                mower.mainlawnover();
            }
            else {
                System.out.println("in lawnmover smartlawnmower is not found");
            }
        }else{
            System.out.println("lawnmover is null");
        }
    }
}
