package Com.Java.Cigratte;

public class CigratteRunner {
    public static void main(String[] args) {
        System.out.println("Running CigratteRunner main class");
        Cigratte cigratte=new Cigratte();
        FlavorSense flavorSense=new FlavorSense(cigratte);

    }
}
