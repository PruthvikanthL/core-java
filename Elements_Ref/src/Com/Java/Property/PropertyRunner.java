package Com.Java.Property;

public class PropertyRunner {
    public static void main(String[] args) {
        Location location=new Location("Benglore","577588");
        Location location1=new Location("Manglore","577886");
        Location[] locations={location,location1};
        Property property=new Property("new pop","568",locations);
        property.display();
    }
}
