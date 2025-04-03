package Com.Java.Liver;

public class LiverRunner {
    public static void main(String[] args) {
        System.out.println("Running LiverRunner main class");
        Liver liver=new Liver();
        EnzymeLevel enzymeLevel=new EnzymeLevel(liver);
    }
}
