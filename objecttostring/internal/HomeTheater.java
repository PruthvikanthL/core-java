package com.inheritance.overriding.internal;

public class HomeTheater {
    private String brand;
    private int numberOfSpeakers;

    public HomeTheater(String brand, int numberOfSpeakers) {
        System.out.println("Running the HomeTheater const");
        this.brand = brand;
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public String toString() {
        return brand + " " + numberOfSpeakers;
    }

    public void theaterDisp() {
        System.out.println("Brand: " + this.brand + ", Number of Speakers: " + this.numberOfSpeakers);
    }

    // Uncomment if needed
    // public void usetheater() {
    //     System.out.println("Running the usetheater method in the superclass");
    // }
}
