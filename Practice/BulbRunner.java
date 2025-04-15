class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        bulb1.display();

        String brand2 = "Philips";
        Bulb bulb2 = new Bulb(brand2);
        bulb2.display();

        String brand3 = "Syska";
        int wattage3 = 9;
        Bulb bulb3 = new Bulb(brand3,wattage3);
        bulb3.display();

        String brand4 = "Havells";
        int wattage4 = 12;
        String type4 = "LED";
        Bulb bulb4 = new Bulb(brand4,wattage4,type4);
        bulb4.display();

        String brand5 = "Bajaj";
        int wattage5 = 15;
        String type5 = "CFL";
        String color5 = "Warm White";
        Bulb bulb5 = new Bulb(brand5,wattage5,type5,color5);
        bulb5.display();

        String brand6 = "Panasonic";
        int wattage6 = 10;
        String type6 = "Halogen";
        String color6 = "Cool White";
        boolean isDimmable6 = true;
        Bulb bulb6 = new Bulb(brand6,wattage6,type6,color6,isDimmable6);
        bulb6.display();

        String brand7 = "Wipro";
        int wattage7 = 20;
        String type7 = "Incandescent";
        String color7 = "Daylight";
        boolean isDimmable7 = false;
        String shape7 = "Round";
        Bulb bulb7 = new Bulb(brand7,wattage7,type7,color7,isDimmable7,shape7);
        bulb7.display();

        String brand8 = "Eveready";
        int wattage8 = 7;
        String type8 = "Smart LED";
        String color8 = "RGB";
        boolean isDimmable8 = true;
        String shape8 = "Oval";
        int lifespan8 = 25000;
        Bulb bulb8 = new Bulb(brand8,wattage8,type8,color8,isDimmable8,shape8,lifespan8);
        bulb8.display();

        String brand9 = "Osram";
        int wattage9 = 5;
        String type9 = "Fluorescent";
        String color9 = "Cool Daylight";
        boolean isDimmable9 = false;
        String shape9 = "Cylindrical";
        int lifespan9 = 15000;
        double price9 = 399.99;
        Bulb bulb9 = new Bulb(brand9,wattage9,type9,color9,isDimmable9,shape9,lifespan9,price9);
        bulb9.display();

        String brand10 = "GE";
        int wattage10 = 18;
        String type10 = "Tube Light";
        String color10 = "Warm Yellow";
        boolean isDimmable10 = true;
        String shape10 = "Tube";
        int lifespan10 = 20000;
        double price10 = 599.99;
        String energyRating10 = "A++";
        boolean isSmart10 = true;
        Bulb bulb10 = new Bulb(brand10,wattage10,type10,color10,isDimmable10,shape10,lifespan10,price10,energyRating10, 
		isSmart10);
        bulb10.display();
    }
}
