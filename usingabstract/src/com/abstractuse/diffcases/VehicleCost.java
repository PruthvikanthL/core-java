package com.abstractuse.diffcases;

class VehicleCost extends Speed{
    int capacity;
    public VehicleCost(String brand,int capacity){
        super(brand);
        this.capacity=capacity;
    }
    public void vehidisp(){
        System.out.println("vehidisp method is running");
    }
}
