class GlassStart {
    public static void main(String[] args) {
        
        String name = "Ramesh";
        String shop = "Glass House";
        String city = "Mumbai";
        String email = "ramesh@gmail.com";
        String phone = "9876543210";

        Glass.seller(name, shop, city, email, phone);
        System.out.println("");

        name = "Suresh";
        shop = "Crystal Clear";
        city = "Delhi";
        email = "suresh@gmail.com";
        phone = "8765432109";

        Glass.seller(name, shop, city, email, phone);
        System.out.println("");

        // Buyer details
        name = "Amit";
        city = "Pune";
        email = "amit@gmail.com";
        phone = "7654321098";
        String purpose = "Restaurant Use";

        Glass.buyer(name, city, email, phone, purpose);
        System.out.println("");

        name = "Vikram";
        city = "Bangalore";
        email = "vikram@gmail.com";
        phone = "6543210987";
        purpose = "Home Renovation";

        Glass.buyer(name, city, email, phone, purpose);
    }
}
