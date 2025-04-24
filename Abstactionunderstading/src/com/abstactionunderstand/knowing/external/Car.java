package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.Vehicle;

public class Car implements Vehicle {
    @Override
    public void Regnumber() {
        System.out.println("Running the Regnumber method in the car class");
    }
}
