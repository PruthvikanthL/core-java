package Com.Java.Tickets;

public class BusStand {
    String busstand_name;
    String bustand_loc;
    public BusStand(String busstand_name,String bustand_loc ){
        this.busstand_name=busstand_name;
        this.bustand_loc=bustand_loc;
    }
    public void show(){
        System.out.println("busstandname\n"+this.busstand_name);
        System.out.println("busstandloc\n"+this.bustand_loc);
    }
}
