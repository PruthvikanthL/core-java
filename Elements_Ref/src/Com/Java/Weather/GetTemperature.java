package Com.Java.Weather;

public class GetTemperature {

    public GetTemperature(Weather weather){
        if(weather!=null){
        System.out.println("Running GetTemperature constractor");
        weather.trackRain();
        measureHumidity();}
        else{
            System.err.println("weather is null");
        }
    }
    public void measureHumidity(){
        System.out.println("Running measureHumidity method in GetTemperature class ");
    }
}
