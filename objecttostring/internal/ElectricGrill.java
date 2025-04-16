package com.inheritance.overriding.internal;

public class ElectricGrill {
    private String brand;
    private int temperature;

    public ElectricGrill() {
        System.out.println("Running the ElectricGrill const");
    }

    public void setElectricGrill(String brand, int temperature) {
        this.brand = brand;
        this.temperature = temperature;
    }

    public String toString() {
        return brand + " " + temperature + "°C";
    }

    public void grillDisp() {
        System.out.println("Brand is " + this.brand + " Temperature is " + this.temperature + "°C");
    }

//    public void useele() {
//        System.out.println("Running the useele method in the ElectricGrill class");
//    }
}
