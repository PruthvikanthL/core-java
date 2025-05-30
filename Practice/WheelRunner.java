class WheelRunner {
    public static void main(String[] args) {
        String brand = "MRF";
        int size = 17;
        String material = "Alloy";
        String color = "Black";
        String type = "Tubeless";
        int price = 1500;
        
        Wheel.info(brand, size, material, color, type, price);
        System.out.println("");
        
        brand = "Ceat";
        size = 15;
        material = "Steel";
        color = "Silver";
        type = "Tube";
        price = 1200;
        
        Wheel.info(brand, size, material, color, type, price);
        System.out.println("");
        
        brand = "Apollo";
        size = 18;
        material = "Carbon";
        color = "Gray";
        type = "Tubeless";
        price = 1800;
        
        Wheel.info(brand, size, material, color, type, price);
        System.out.println("");
        
        brand = "JK Tyres";
        size = 16;
        material = "Aluminum";
        color = "Black";
        type = "Tube";
        price = 1400;
        
        Wheel.info(brand, size, material, color, type, price);
        System.out.println("");
        
        brand = "Bridgestone";
        size = 19;
        material = "Magnesium";
        color = "White";
        type = "Tubeless";
        price = 2000;
        
        Wheel.info(brand, size, material, color, type, price);
    }
}
`