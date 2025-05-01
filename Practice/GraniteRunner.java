class GraniteRunner {
    public static void main(String[] args) {
        Granite granite = new Granite();
        granite.display();

        String id = "101";
        Granite granite1 = new Granite(id);
        granite1.display();

        String id2 = "201";
        double weightLimit = 200;
        Granite granite2 = new Granite(id2,weightLimit);
        granite2.display();

        String id3 = "301";
        double weightLimit2 = 250;
        String material = "marble";
        Granite granite3 = new Granite(id3,weightLimit2,material);
        granite3.display();

        String id4 = "401";
        double weightLimit3 = 300;
        String material1 = "granite";
        String location = "Mysore";
        Granite granite4 = new Granite(id4,weightLimit3,material1,location);
        granite4.display();

        String id5 = "501";
        double weightLimit4 = 350;
        String material2 = "quartz";
        String location1 = "Hassan";
        boolean isFull = true;
        Granite granite5 = new Granite(id5,weightLimit4,material2,location1,isFull);
        granite5.display();

        String id6 = "601";
        double weightLimit5 = 400;
        String material3 = "onyx";
        String location2 = "Tumkur";
        boolean isFull1 = true;
        Granite granite6 = new Granite(id6,weightLimit5,material3,location2,isFull1);
        granite6.display();

        String id7 = "541";
        double weightLimit6 = 450;
        String material4 = "limestone";
        String location3 = "Mandya";
        boolean isFull2 = true;
        int capacity = 45;
        Granite granite7 = new Granite(id7,weightLimit6,material4,location3,isFull2,capacity);
        granite7.display();

        String id8 = "641";
        double weightLimit7 = 500;
        String material5 = "basalt";
        String location4 = "Bellary";
        boolean isFull3 = true;
        int capacity1 = 50;
        String modelNumber = "GRX123";
        Granite granite8 = new Granite(id8,weightLimit7,material5,location4,isFull3,capacity1,modelNumber);
        granite8.display();

        String id9 = "741";
        double weightLimit8 = 600;
        String material6 = "travertine";
        String location5 = "Bangalore";
        boolean isFull4 = true;
        int capacity2 = 55;
        String modelNumber1 = "GRX456";
        Granite granite9 = new Granite(id9,weightLimit8,material6,location5,isFull4,capacity2,modelNumber1);
        granite9.display();

        String id10 = "841";
        double weightLimit9 = 700;
        String material7 = "soapstone";
        String location6 = "Chitradurga";
        boolean isFull5 = true;
        int capacity3 = 60;
        String modelNumber2 = "GRX789";
        long lastCheck = 345678;
        Granite granite10 = new Granite(id10,weightLimit9,material7,location6,isFull5,capacity3,modelNumber2,
		lastCheck);
        granite10.display();

        String id11 = "941";
        double weightLimit10 = 800;
        String material8 = "feldspar";
        String location7 = "Davanagere";
        boolean isFull6 = true;
        int capacity4 = 65;
        String modelNumber3 = "GRX999";
        long lastCheck1 = 567890;
        String instructions = "Handle with care";
        Granite granite11 = new Granite(id11,weightLimit10,material8,location7,isFull6,capacity4,modelNumber3,
		lastCheck1,instructions);
        granite11.display();

        String id12 = "1041";
        double weightLimit11 = 900;
        String material9 = "gneiss";
        String location8 = "Shimoga";
        boolean isFull7 = true;
        int capacity5 = 70;
        String modelNumber4 = "GRX777";
        long lastCheck2 = 789012;
        String instructions1 = "Use carefully";
        boolean reusable = true;
        Granite granite12 = new Granite(id12,weightLimit11,material9,location8,isFull7,capacity5,modelNumber4,
		lastCheck2, instructions1, reusable);
        granite12.display();
    }
}
