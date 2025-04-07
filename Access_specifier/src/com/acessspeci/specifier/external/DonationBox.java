package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Temple;

public class DonationBox {
    public DonationBox(){
        System.out.println("Runnnig external Donationbox const");
    }
    public void Restingarea(){
        System.out.println("Running external Restingarea method and calling public method from temple");
        Temple temple=new Temple();
        temple.ticket_counter();
    }
}
