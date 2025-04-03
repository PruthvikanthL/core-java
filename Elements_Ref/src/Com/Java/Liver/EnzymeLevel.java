package Com.Java.Liver;

public class EnzymeLevel {
    public EnzymeLevel(Liver liver){
        if(liver!=null){
        System.out.println("Running EnzymeLevel constructor");
        liver.hepatocheck();
        bileflow();}
        else{
            System.err.println("liver in null");
        }
    }
    public void bileflow(){
        System.out.println("Running BileFlow method in EnzymeLevel class");
    }
}
