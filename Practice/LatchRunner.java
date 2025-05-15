class LatchRunner {
    public static void main(String[] args) {
        String type = "Deadbolt";
        int price = 500;
        
        Latch.typesWithPrice(type, price);
        System.out.println("");
        
        type = "Spring Latch";
        price = 300;
        
        Latch.typesWithPrice(type, price);
        System.out.println("");
        
        type = "Chain Latch";
        price = 400;
        
        Latch.typesWithPrice(type, price);
        System.out.println("");
        
        type = "Barrel Bolt";
        price = 250;
        
        Latch.typesWithPrice(type, price);
        System.out.println("");
        
        type = "Magnetic Latch";
        price = 600;
        
        Latch.typesWithPrice(type, price);
    }
}