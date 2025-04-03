package Com.Java.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        System.out.println("Runnning UmbrellaRunner main class");
        Umbrella umbrella=new Umbrella();
        AutoOpen autoOpen=new AutoOpen(umbrella);
    }
}
