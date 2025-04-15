class BulletRunner {
    public static void main(String[] args) {
        String type = "Hollow Point";
        double caliber = 9.0;
        int weight = 124;
        String material = "Lead";
        int price = 50;

        Bullet.displayInfo(type, caliber, weight, material, price);
    }
}