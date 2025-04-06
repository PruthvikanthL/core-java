class AK47Runner {
    public static void main(String[] args) {
        AK47 gun1 = new AK47();
        gun1.display();

        String model2 = "AK-47M";
        AK47 gun2 = new AK47(model2);
        gun2.display();

        String model3 = "AK-74";
        int caliber3 = 5;
        AK47 gun3 = new AK47(model3, caliber3);
        gun3.display();

        String model4 = "AK-103";
        int caliber4 = 7;
        String manufacturer4 = "Kalashnikov Concern";
        AK47 gun4 = new AK47(model4, caliber4, manufacturer4);
        gun4.display();

        String model5 = "AK-12";
        int caliber5 = 5;
        String manufacturer5 = "Russia";
        String action5 = "Gas-operated";
        AK47 gun5 = new AK47(model5, caliber5, manufacturer5, action5);
        gun5.display();

        String model6 = "AK-19";
        int caliber6 = 5;
        String manufacturer6 = "Russia";
        String action6 = "Gas-operated";
        boolean isAutomatic6 = true;
        AK47 gun6 = new AK47(model6, caliber6, manufacturer6, action6, isAutomatic6);
        gun6.display();

        String model7 = "AK-200";
        int caliber7 = 7;
        String manufacturer7 = "Kalashnikov Concern";
        String action7 = "Gas-operated";
        boolean isAutomatic7 = true;
        int magazineCapacity7 = 30;
        AK47 gun7 = new AK47(model7, caliber7, manufacturer7, action7, isAutomatic7, magazineCapacity7);
        gun7.display();

        String model8 = "AK-203";
        int caliber8 = 7;
        String manufacturer8 = "India-Russia";
        String action8 = "Gas-operated";
        boolean isAutomatic8 = true;
        int magazineCapacity8 = 30;
        String specialFeature8 = "Picatinny rail";
        AK47 gun8 = new AK47(model8, caliber8, manufacturer8, action8, isAutomatic8, magazineCapacity8, specialFeature8);
        gun8.display();

        String model9 = "AK-205";
        int caliber9 = 5;
        String manufacturer9 = "Russia";
        String action9 = "Gas-operated";
        boolean isAutomatic9 = true;
        int magazineCapacity9 = 30;
        String specialFeature9 = "Adjustable stock";
        String country9 = "Russia";
        AK47 gun9 = new AK47(model9, caliber9, manufacturer9, action9, isAutomatic9, magazineCapacity9, specialFeature9, country9);
        gun9.display();

        String model10 = "AK-47 Classic";
        int caliber10 = 7;
        String manufacturer10 = "Soviet Union";
        String action10 = "Gas-operated";
        boolean isAutomatic10 = true;
        int magazineCapacity10 = 30;
        String specialFeature10 = "Wooden stock";
        String country10 = "Soviet Union";
        int yearProduced10 = 1947;
        double weight10 = 4.3;
        AK47 gun10 = new AK47(model10, caliber10, manufacturer10, action10, isAutomatic10, magazineCapacity10, specialFeature10, country10, yearProduced10, weight10);
        gun10.display();
    }
}
