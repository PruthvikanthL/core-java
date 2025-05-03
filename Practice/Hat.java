class Hat {
    public static void main(String[] args) {
        String brand = "Nike";
        int size = 58; 
        String color = "Black";
        int quantity = 2;
        double price = 29.99;
        boolean isAdjustable = true;
        char category = 'A'; // Apparel
        long barcode = 1239874560L;
        byte rating = 9;

        System.out.println("The info about the Hat is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Color --> " + color);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Adjustable --> " + isAdjustable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

        brand = "Adidas";
        size = 60;
        color = "Blue";
        quantity = 1;
        price = 34.99;
        isAdjustable = false;
        category = 'S'; // Sportswear
        barcode = 9871236540L;
        rating = 8;

        System.out.println("\nUpdated info about the Hat is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Color --> " + color);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Adjustable --> " + isAdjustable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
