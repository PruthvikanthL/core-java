package Com.Java.Kidney;

public class FiltrationRate {
    public FiltrationRate(Kidney kidney){
        if(kidney!=null){
        System.out.println("Running FiltrationRate constructor");
        kidney.nephrocheck();
        toxinmonitor();}
        else{
            System.err.println("kidney is null");
        }
    }
    public void toxinmonitor(){
        System.out.println("Running ToxinMonitor method in FiltrationRate class");
    }

}
