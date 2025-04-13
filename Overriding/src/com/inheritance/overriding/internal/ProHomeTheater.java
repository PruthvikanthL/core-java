package com.inheritance.overriding.internal;

public class ProHomeTheater extends HomeTheater{
    public ProHomeTheater(){
        System.out.println("Running the HomeTheater const");
    }
    public void showhome(HomeTheater homeTheater){
        if(homeTheater!=null){
            homeTheater.usetheater();
            if(homeTheater instanceof EliteHomeTheater){
                EliteHomeTheater elite=(EliteHomeTheater) homeTheater;
                elite.maintheater();
            }
            else {
                System.out.println("in hometheater EliteHomeTheater is not found");
            }
        }else {
            System.out.println("hometheater is null");
        }
    }
}
