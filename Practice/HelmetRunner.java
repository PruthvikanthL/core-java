class HelmetRunner {
    public static void main(String[] args) {
        String brand = "Steelbird";
        String color = "Black";
        String type = "Full Face";
        String size = "L";
        int price = 2500;
        
        Helmet.details(brand, color, type, size, price);
        System.out.println("");
        
        brand = "Vega";
        color = "Red";
        type = "Half Face";
        size = "M";
        price = 1800;
        
        Helmet.details(brand, color, type, size, price);
        System.out.println("");
        
        brand = "Studds";
        color = "Blue";
        type = "Modular";
        size = "XL";
        price = 2300;
        
        Helmet.details(brand, color, type, size, price);
        System.out.println("");
        
        brand = "LS2";
        color = "White";
        type = "Off-Road";
        size = "L";
        price = 3500;
        
        Helmet.details(brand, color, type, size, price);
        System.out.println("");
        
        brand = "Royal Enfield";
        color = "Green";
        type = "Open Face";
        size = "S";
        price = 2800;
        
        Helmet.details(brand, color, type, size, price);
    }
}