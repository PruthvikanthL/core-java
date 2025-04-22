package com.abstractuse.diffcases;

class Speed extends ElectricCar {
    String brand;
    public Speed(String brand){
        this.brand=brand;
    }
  public void acce(){
      System.out.println(brand+"brand name and accee method is running");
  }
    @Override
    public void electdisp() {
        System.out.println("electdisp method implemented in Speed class");
    }

    @Override
    public void electshow() {
        System.out.println("electshow method implemented in Speed class");
    }
}
