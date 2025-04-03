package Com.Java.Earth;

public class EarthRunner {
    public static void main(String[] args) {

        System.out.println("Running EarthRunner main class");
    Earth earth=new Earth();
    MeasureGravity measureGravity=new MeasureGravity(earth);
}}
