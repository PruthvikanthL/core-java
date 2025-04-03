package Com.Java.Earth;

import javax.sound.midi.Soundbank;

public class MeasureGravity {
    public MeasureGravity(Earth earth){
        if(earth!=null){
        System.out.println("Running measureGravity Constru");
        earth.analyzeSoil();
        trackEarthquake();}
        else{
            System.err.println("earth is null");
        }
    }
    public void trackEarthquake(){
        System.out.println("Running trackEarthquake method in MeasureGravity class");
    }
}
