package Com.Java.Property;

public class Location {
    String loc_name;
    String pincode;
    public Location(String loc_name,String pincode){
        this.loc_name=loc_name;
        this.pincode=pincode;

    }
    public void show(){
        System.out.println("The location name is"+this.loc_name);
        System.out.println("The pincode is "+this.pincode);
    }
}
