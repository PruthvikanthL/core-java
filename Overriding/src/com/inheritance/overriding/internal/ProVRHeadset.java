package com.inheritance.overriding.internal;

public class ProVRHeadset extends VRHeadset{
    public ProVRHeadset(){
        System.out.println("Running the ProVRHeadset const");
    }
    public void showvr(VRHeadset vrHeadset){
        if(vrHeadset!=null){
            vrHeadset.usehead();
            if(vrHeadset instanceof EliteVRHeadset){
                EliteVRHeadset set=(EliteVRHeadset) vrHeadset;
                set.mainhead();
            }
            else{
                System.out.println("in VRheadset eliteheadset in not found");
            }
        }else{
            System.out.println("vrheadset is null");
        }
    }
}
