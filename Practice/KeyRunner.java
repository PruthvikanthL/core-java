class KeyRunner {
    public static void main(String[] args) {
        String type = "Car Key";
        String material = "Metal";
        String color = "Black";
        
        Key.details(type, material, color);
        System.out.println("");
        
        type = "House Key";
        material = "Brass";
        color = "Gold";
        
        Key.details(type, material, color);
        System.out.println("");
        
        type = "Bike Key";
        material = "Steel";
        color = "Silver";
        
        Key.details(type, material, color);
    }
}