package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Drone;

public class GPSSystem {
    public GPSSystem(){
        System.out.println("Running GPS System const from extranal package");
    }
    public void gpsdisp(){
        System.out.println("Running gpsdisp method and accessing public method from Drone");
        Drone drone=new Drone();
        drone.Propellers();
    }
}
