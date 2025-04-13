package com.inheritance.overriding.internal;

public class UltraProProjector extends Projector{
    public UltraProProjector(){
        System.out.println("Running the UltraProProjector const");
    }
    public void showprojector(Projector projector){
        if(projector!=null){
            projector.useprojector();
            if(projector instanceof ProProjector){
                ProProjector proProjector=(ProProjector) projector;
                proProjector.mainprojector();
            }
            else{
                System.out.println("in projector proprojector is  not found");
            }
        }else{
            System.out.println("projector is null");
        }
    }
}
