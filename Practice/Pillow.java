class Pillow {
    public static void main(String[] args) {
        String brand = "SleepWell";
        int size = 60; 
        String material = "Memory Foam";
        int quantity = 2;
        double price = 25.99;
        boolean isWashable = true;
        char category = 'B';
        long barcode = 7896541230L;
        byte rating = 9;

        System.out.println("The info about the Pillow is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity + " pieces");
        System.out.println("Price --> $" + price);
        System.out.println("Washable --> " + isWashable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

        
        brand = "ComfyRest";
        size = 70;
        material = "Feather";
        quantity = 3;
        price = 30.50;
        isWashable = false;
        category = 'A';
        barcode = 6543219870L;
        rating = 8;

        System.out.println("\nUpdated info about the Pillow is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity + " pieces");
        System.out.println("Price --> $" + price);
        System.out.println("Washable --> " + isWashable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
