package com.abstractuse.diffcases;

abstract class Device {
    String brand;
    public Device(String brand) {
        this.brand = brand;
    }
    public abstract void keyboard();
}
