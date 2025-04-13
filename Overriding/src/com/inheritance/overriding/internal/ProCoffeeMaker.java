package com.inheritance.overriding.internal;

public class ProCoffeeMaker extends CoffeeMaker {
    public ProCoffeeMaker() {
        System.out.println("Running the ProCoffeeMaker const");
    }

    public void showcoffee(CoffeeMaker coffeeMaker) {
        if(coffeeMaker!=null){
            coffeeMaker.usecoffe();
            if(coffeeMaker instanceof UltraCoffeeMaker){
                UltraCoffeeMaker coffee=(UltraCoffeeMaker) coffeeMaker;
                coffee.maincoffee();
            }
            else {
                System.out.println("in coffeemaker Ultracoffeemaker not found");
            }}
        else
            {
                System.out.println("coffeemaker is null");
            }

    }
}