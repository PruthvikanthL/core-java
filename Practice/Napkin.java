class Napkin {
    public static void main(String[] args) {
        String brand = "SoftTouch";
        int size = 30;
        String material = "Cotton";
        int quantity = 10;
        double price = 5.5;
        boolean isReusable = true;
        char category = 'H';
        long barcode = 1239876543L;
        byte rating = 9;

        System.out.println("The info about the Napkin is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity + " pieces");
        System.out.println("Price --> $" + price);
        System.out.println("Reusable --> " + isReusable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");

       
        brand = "UltraSoft";
        size = 35;
        material = "Bamboo Fiber";
        quantity = 15;
        price = 7.0;
        isReusable = false;
        category = 'L';
        barcode = 4567890123L;
        rating = 8;

        System.out.println("\nUpdated info about the Napkin is ---> \n");
        System.out.println("Brand --> " + brand);
        System.out.println("Size --> " + size + "cm");
        System.out.println("Material --> " + material);
        System.out.println("Quantity --> " + quantity + " pieces");
        System.out.println("Price --> $" + price);
        System.out.println("Reusable --> " + isReusable);
        System.out.println("Category --> " + category);
        System.out.println("Barcode --> " + barcode);
        System.out.println("Rating --> " + rating + "/10");
    }
}
