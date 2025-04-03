package Com.Java.Earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        System.out.println("Running EarbudRunner main method");
        Earbud earbud=new Earbud();
        NoiseShield noiseShield=new NoiseShield(earbud);
    }
}
