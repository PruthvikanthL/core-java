class Ring {
    public static void main(String[] args) {
        String brand = "Tiffany & Co.";
        int size = 7; 
        String material = "Gold";
        int quantity = 1;
        double price = 999.99;
        boolean isEngraved = true;
        char category = 'J'; // Jewelry
        long barcode = 4567891230L;
        byte rating = 10;

        System.out.println("The info about the Ring is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size);
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Engraved --> " + isEngraved);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

        
        brand = "Cartier";
        size = 8;
        material = "Platinum";
        quantity = 1;
        price = 1299.99;
        isEngraved = false;
        category = 'L'; // Luxury Jewelry
        barcode = 7891234560L;
        rating = 9;

        System.out.println("\nUpdated info about the Ring is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size);
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Engraved --> " + isEngraved);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
