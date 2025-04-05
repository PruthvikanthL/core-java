package Com.Java.Tickets;

public class TicketsRunner {
    public static void main(String[] args) {
        BusStand busStand=new BusStand("majestic","benglore");
        BusStand busStand1=new BusStand("kempegowda","benglore");
        BusStand[] busStands={busStand,busStand1};
        Tickets tickets=new Tickets("Benglore","challakere",20,busStands);
        tickets.display();
    }
}
