package Com.Java.Kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        System.out.println("Running KidneyRunner main method");
        Kidney kidney=new Kidney();
        FiltrationRate filtrationRate=new FiltrationRate(kidney);
    }
}
