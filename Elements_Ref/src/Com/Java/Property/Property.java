package Com.Java.Property;

public class Property {
    String pop_name;
    String size;
    Location[] loc;
    public Property(String pop_name,String size,Location[] loc){
        this.pop_name=pop_name;
        this.size=size;
        this.loc=loc;
    }
    public void display(){
        System.out.println("The Property name is "+this.pop_name);
        System.out.println("The Property size is"+this.size);
        for(Location loca:loc){
            loca.show();
        }
    }
}
