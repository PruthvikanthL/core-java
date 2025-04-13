package com.inheritance.overriding.internal;

public class UltraWeatherStation extends WeatherStation{
    public UltraWeatherStation(){
        System.out.println("Runninng the UltraWeatherStation const");
    }
    public void showstation(WeatherStation weatherStation){
        if(weatherStation!=null){
            weatherStation.useweather();
            if(weatherStation instanceof ProWeatherStation){
                ProWeatherStation station=(ProWeatherStation) weatherStation;
                station.mainweather();
            }
            else{
                System.out.println("in weatherstation ProWeatherStation is not found");
            }
        }else{
            System.out.println("weatherstation in null");
        }
    }
}
