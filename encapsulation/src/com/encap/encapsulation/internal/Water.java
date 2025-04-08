package com.encap.encapsulation.internal;

public class Water {
    public void waterdisp(){
        Tank tank=new Tank();
        System.out.println("The Tank name is"+tank.getName());
        System.out.println("The tank size is"+tank.getSize());
        System.out.println("The tand filled is"+tank.getfilled());
        System.out.println("The tank color is "+tank.getColor());
        System.out.println("The tank level is"+tank.getLevel());
        tank.setName("xyz123");
        tank.setSize(44);
        tank.setfilled(false);
        tank.setColor("white");
        tank.setLevel(100);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("The Updated values are ");
        System.out.println("The updated Tank name is"+tank.getName());
        System.out.println("The updated tank size is"+tank.getSize());
        System.out.println("The updated tand filled is"+tank.getfilled());
        System.out.println("The updated tank color is "+tank.getColor());
        System.out.println("The updated tank level is"+tank.getLevel());
    }
}
