class Bed {
    public static void main(String[] args) {
        String brand = "DreamHome";
        int size = 200; 
        String material = "Wood";
        int quantity = 1;
        double price = 499.99;
        boolean hasStorage = true;
        char category = 'F'; // Furniture
        long barcode = 9876543210L;
        byte rating = 9;

        System.out.println("The info about the Bed is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Has Storage --> " + hasStorage);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

       
        brand = "CozyNest";
        size = 220;
        material = "Metal";
        quantity = 1;
        price = 599.99;
        hasStorage = false;
        category = 'L'; // Luxury
        barcode = 1234567890L;
        rating = 8;

        System.out.println("\nUpdated info about the Bed is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity);
        System.out.println("Price --> $" + price);
        System.out.println("Has Storage --> " + hasStorage);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
