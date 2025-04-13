package com.inheritance.overriding.internal;

public class ProDishwasher extends Dishwasher{
    public ProDishwasher(){
        System.out.println("Running the ProDishwasher const");
    }
    public void showdish(Dishwasher dishwasher){
        if(dishwasher!=null){
            dishwasher.usedishwasher();
            if(dishwasher instanceof MaxDishwasher){
                MaxDishwasher dish=(MaxDishwasher) dishwasher;
                dish.maindishwasher();
            }else{
                System.out.println("in dishwasher maxdishwasher not found");
            }
        }else{
            System.out.println("dishwasher is null");
        }
    }
}
