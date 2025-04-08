package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Tank;

public class Fuel {
    public void fueldisp(){
        Tank tank=new Tank();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("The Tank name is"+tank.getName());
        System.out.println("The tank size is"+tank.getSize());
        System.out.println("The tand filled is"+tank.getfilled());
        System.out.println("The tank color is "+tank.getColor());
        System.out.println("The tank level is"+tank.getLevel());
    }
}
