package com.encap.encapsulation.internal;

public class GymTester {
    public void gymDisp() {
        Gym gym = new Gym();
        System.out.println("GymName is"+gym.getName());
        System.out.println("GymLocation is"+gym.getLocation());
        System.out.println("GymCapacity is"+gym.getCapacity());
        System.out.println("HasTrainer is"+gym.getHasTrainer());
        System.out.println("OpenHours is"+gym.getOpenHours());
        gym.setName("IronBody");
        gym.setLocation("NehruCircleChallakere");
        gym.setCapacity(80);
        gym.setHasTrainer(false);
        gym.setOpenHours("5AMto11PM");
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Updated GymName is"+gym.getName());
        System.out.println("Updated GymLocation is"+gym.getLocation());
        System.out.println("Updated GymCapacity is"+gym.getCapacity());
        System.out.println("Updated HasTrainer is"+gym.getHasTrainer());
        System.out.println("Updated OpenHours is"+gym.getOpenHours());
    }
}
