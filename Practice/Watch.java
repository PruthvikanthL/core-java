class Watch {
    public static void main(String[] args) {
        String brand = "Rolex";
        int diameter = 40;
        String type = "Analog";
        int quantity = 1;
        double price = 1500.0;
        boolean isWaterproof = true;
        char category = 'A';
        long barcode = 2345678901L;
        byte rating = 10;

        System.out.println("The info about the Watch is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Diameter --> " + diameter + "mm");
        System.out.println("Type --> " + type);
        System.out.println("Quantity --> " + quantity + " piece");
        System.out.println("Price --> $" + price);
        System.out.println("Waterproof --> " + isWaterproof);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

       
        brand = "Titan";
        diameter = 42;
        type = "Digital";
        quantity = 2;
        price = 250.0;
        isWaterproof = false;
        category = 'B';
        rating = 8;

        System.out.println("\nUpdated info about the Watch is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Diameter --> " + diameter + "mm");
        System.out.println("Type --> " + type);
        System.out.println("Quantity --> " + quantity + " pieces");
        System.out.println("Price --> $" + price);
        System.out.println("Waterproof --> " + isWaterproof);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
