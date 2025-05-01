class Glass {
    public static void seller(String name, String shop, String city, String email, String phone) {
        System.out.println("Seller Name: " + name);
        System.out.println("Shop Name: " + shop);
        System.out.println("City: " + city);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public static void buyer(String name, String city, String email, String phone, String purpose) {
        System.out.println("Buyer Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Purpose: " + purpose);
    }
}