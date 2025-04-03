package Com.Java.Cigratte;

public class FlavorSense {
    public FlavorSense(Cigratte cigratte){
        if(cigratte!=null){
        System.out.println("Running FlavorSense Constructor");
        cigratte.BrandCheck();
        burnduration();}
        else{
            System.err.println("cigratte is null");
        }
    }
    public void burnduration(){
        System.out.println("Running BurnDuration method in Flavorsense class");
    }
}
