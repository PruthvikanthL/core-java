class CementRunner {
    public static void main(String[] args) {
        Cement cement = new Cement();
        cement.display();

        String id = "101";
        Cement cement1 = new Cement(id);
        cement1.display();

        String id2 = "201";
        double weightLimit = 200;
        Cement cement2 = new Cement(id2,weightLimit);
        cement2.display();

        String id3 = "301";
        double weightLimit2 = 250;
        String material = "Portland";
        Cement cement3 = new Cement(id3,weightLimit2,material);
        cement3.display();

        String id4 = "401";
        double weightLimit3 = 300;
        String material1 = "Concrete";
        String location = "Mysore";
        Cement cement4 = new Cement(id4,weightLimit3,material1,location);
        cement4.display();

        String id5 = "501";
        double weightLimit4 = 350;
        String material2 = "White Cement";
        String location1 = "Hassan";
        boolean isFull = true;
        Cement cement5 = new Cement(id5,weightLimit4,material2,location1,isFull);
        cement5.display();

        String id6 = "601";
        double weightLimit5 = 400;
        String material3 = "Masonry";
        String location2 = "Tumkur";
        boolean isFull1 = true;
        Cement cement6 = new Cement(id6,weightLimit5,material3,location2,isFull1);
        cement6.display();

        String id7 = "541";
        double weightLimit6 = 450;
        String material4 = "Rapid Hardening";
        String location3 = "Mandya";
        boolean isFull2 = true;
        int capacity = 45;
        Cement cement7 = new Cement(id7,weightLimit6,material4,location3,isFull2,capacity);
        cement7.display();

        String id8 = "641";
        double weightLimit7 = 500;
        String material5 = "Sulphate Resistant";
        String location4 = "Bellary";
        boolean isFull3 = true;
        int capacity1 = 50;
        String modelNumber = "CMT123";
        Cement cement8 = new Cement(id8,weightLimit7,material5,location4,isFull3,capacity1,modelNumber);
        cement8.display();

        String id9 = "741";
        double weightLimit8 = 600;
        String material6 = "High Alumina";
        String location5 = "Bangalore";
        boolean isFull4 = true;
        int capacity2 = 55;
        String modelNumber1 = "CMT456";
        Cement cement9 = new Cement(id9,weightLimit8,material6,location5,isFull4,capacity2,modelNumber1);
        cement9.display();

        String id10 = "841";
        double weightLimit9 = 700;
        String material7 = "Pozzolana";
        String location6 = "Chitradurga";
        boolean isFull5 = true;
        int capacity3 = 60;
        String modelNumber2 = "CMT789";
        long lastCheck = 345678;
        Cement cement10 = new Cement(id10,weightLimit9,material7,location6,isFull5,capacity3,modelNumber2,
		lastCheck);
        cement10.display();
    }
}