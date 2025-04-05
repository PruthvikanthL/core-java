package Com.Java.Tickets;

public class Tickets {
    private String source;
    private String dest;
    private float cost;
    private BusStand[] bus;
    public Tickets(String source,String dest,float cost,BusStand[] bus){
        this.source=source;
        this.dest=dest;
        this.cost=cost;
        this.bus=bus;
    }
    public void display(){
        System.out.println("source"+this.source);
        System.out.println("Dest"+this.dest);
        System.out.println("cost"+this.cost);
        for(BusStand busStand:bus){
            busStand.show();

        }
    }
}
