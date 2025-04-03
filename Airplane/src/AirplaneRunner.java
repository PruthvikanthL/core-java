public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane airplane=new Airplane();
        airplane.display();
        Airplane airplane1=new Airplane(100,"Rock_india");
        airplane1.display();
        Airplane airplane2=new Airplane(101,"Namma karnataka","benglore",50);
        airplane2.display();
        Airplane airplane3=new Airplane(102,"Rock india","delhi",55,"Benglore",45);
        airplane3.display();
        Airplane airplane4=new Airplane(103,"jai Bharath","karnatka",65,"challakere",85,10000,"active");
        airplane4.display();

    }
}
