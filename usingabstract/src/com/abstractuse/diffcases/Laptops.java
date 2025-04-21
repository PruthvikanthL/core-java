package com.abstractuse.diffcases;

class Laptops extends Device {
    int ram;
    public Laptops(String brand, int ram) {
        super(brand);
        this.ram = ram;
    }
    public void keyboard() {
        System.out.println(brand + " laptop with " + ram + "GB RAM.");
    }
}
