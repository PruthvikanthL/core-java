class GlassStart {
    public static void main(String[] args) {
        
        String name = "Ramesh";
        String shop = "Glass House";
        String city = "Mumbai";
        String email = "ramesh@example.com";
        String phone = "9876543210";

        Glass.seller(name, shop, city, email, phone);
        System.out.println("");

        name = "Suresh";
        shop = "Crystal Clear";
        city = "Delhi";
        email = "suresh@example.com";
        phone = "8765432109";

        Glass.seller(name, shop, city, email, phone);
        System.out.println("");

       
        name = "Amit";
        city = "Pune";
        email = "amit@example.com";
        phone = "7654321098";
        String purpose = "Restaurant Use";

        Glass.buyer(name, city, email, phone, purpose);
        System.out.println("");

        name = "Vikram";
        city = "Bangalore";
        email = "vikram@example.com";
        phone = "6543210987";
        purpose = "Home Renovation";

        Glass.buyer(name, city, email, phone, purpose);
    }
}
