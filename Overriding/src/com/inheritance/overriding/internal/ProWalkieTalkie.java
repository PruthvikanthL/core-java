package com.inheritance.overriding.internal;

public class ProWalkieTalkie extends WalkieTalkie{
    public ProWalkieTalkie(){
        System.out.println("Ruunning the ProWalkieTalkie const");
    }
    public void showalkie(WalkieTalkie walkieTalkie){
        if(walkieTalkie!=null){
            walkieTalkie.usewalk();
            if(walkieTalkie instanceof EliteWalkieTalkie){
                EliteWalkieTalkie walk=(EliteWalkieTalkie) walkieTalkie;
                walk.mainwalk();
            }else{
                System.out.println("in walkietalkie EliteWalkieTalkie is not found");
            }
        }else{
            System.out.println("walkietalkie is null");
        }
    }
}
