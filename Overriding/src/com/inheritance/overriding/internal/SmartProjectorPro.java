package com.inheritance.overriding.internal;

public class SmartProjectorPro extends ProjectorPro{
    public SmartProjectorPro(){
        System.out.println("Runninng the smartProjectorPro const");
    }
    public void shoepro(ProjectorPro projectorPro){
        if(projectorPro!=null){
            projectorPro.usepro();
            if(projectorPro instanceof ProProjectorPro){
                ProProjectorPro pro=(ProProjectorPro) projectorPro;
                pro.mainpro();
            }else{
                System.out.println("in Projectorpro ProProjectorPro is not found");
            }
        }else{
            System.out.println("Projectorpro is null");
        }
    }
}
