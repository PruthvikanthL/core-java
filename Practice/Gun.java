public class Gun {
    public static void displayInfo(String type, String color, int ammoCapacity, String actionType, int price, String country, String warranty, String license) {
        System.out.println("Gun Details:");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Ammo Capacity: " + ammoCapacity);
        System.out.println("Action Type: " + actionType);
        System.out.println("Price: " + price);
        System.out.println("Manufactured in: " + country);
        System.out.println("Warranty: " + warranty);
        System.out.println("License Requirement: " + license);
    }
}
