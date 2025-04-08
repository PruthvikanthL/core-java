package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Gym;

public class GymManager {
    public void manageDisp() {
        Gym gym = new Gym();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("GymName is"+gym.getName());
        System.out.println("Location is"+gym.getLocation());
        System.out.println("Capacity is"+gym.getCapacity());
        System.out.println("HasTrainer is"+gym.getHasTrainer());
        System.out.println("OpenHours is"+gym.getOpenHours());
    }
}
