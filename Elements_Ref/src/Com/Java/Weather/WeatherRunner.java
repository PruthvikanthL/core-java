package Com.Java.Weather;

public class WeatherRunner {
    public static void main(String[] args) {
        System.out.println("Running WeatherRunner main class");
        Weather weather=new Weather();
        GetTemperature getTemperature=new GetTemperature(weather);
    }
}
