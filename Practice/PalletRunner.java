class PalletRunner {

    public static void main(String[] args) {
        Pallet pallet = new Pallet();
        pallet.display();

        String id = "100";
        Pallet pallet1 = new Pallet(id);
        pallet1.display();

        String id2 = "200";
        double weightlimit = 150;
        Pallet pallet2 = new Pallet(id2,weightlimit);
        pallet2.display();

        String id3 = "300";
        double weightlimit2 = 150;
        String material = "silicon";
        Pallet pallet3 = new Pallet(id3,weightlimit2,material);
        pallet3.display();

        String id4 = "400";
        double weightlimit3 = 150;
        String material1 = "copper";
        String location = "challakere";
        Pallet pallet4 = new Pallet(id4,weightlimit3,material1,location);
        pallet4.display();

        String id5 = "500";
        double weightlimit4 = 150;
        String material2 = "copper";
        String location1 = "Chitradurga";
        boolean isfull = true;
        Pallet pallet5 = new Pallet(id5,weightlimit4,material2,location1,isfull);
        pallet5.display();

        String id6 = "600";
        double weightlimit5 = 250;
        String material3 = "iron";
        String location2 = "Davanagere";
        boolean isfull1 = true;
        Pallet pallet6 = new Pallet(id6,weightlimit5,material3,location2,isfull1);
        pallet6.display();

        String id7 = "540";
        double weightlimit6 = 340;
        String material4 = "iron copper";
        String location3 = "Shivamoga";
        boolean isfull2 = true;
        int capacity = 35;
        Pallet pallet7 = new Pallet(id7,weightlimit6,material4,location3,isfull2,capacity);
        pallet7.display();

        String id8 = "640";
        double weightlimit7 = 440;
        String material5 = "wood";
        String location4 = "Ballary";
        boolean isfull3 = true;
        int capacity1 = 40;
        String modelnumber = "KAX123";
        Pallet pallet8 = new Pallet(id8,weightlimit7,material5,location4,isfull3,capacity1,modelnumber);
        pallet8.display();

        String id9 = "740";
        double weightlimit8 = 560;
        String material6 = "wood iron";
        String location5 = "Benglore";
        boolean isfull4 = true;
        int capacity2 = 50;
        String modelnumber1 = "KAX886";
        Pallet pallet9 = new Pallet(id9,weightlimit8,material6,location5,isfull4,capacity2,modelnumber1);
        pallet9.display();

        String id10 = "740";
        double weightlimit9 = 560;
        String material7 = "wood iron";
        String location6 = "Benglore";
        boolean isfull5 = true;
        int capacity3 = 50;
        String modelnumber2 = "KAX886";
        long lastCheck = 281002;
        Pallet pallet10 = new Pallet(id10,weightlimit9,material7,location6,isfull5,capacity3,modelnumber2, 
		lastCheck);
        pallet10.display();

        String id11 = "440";
        double weightlimit10 = 760;
        String material8 = "coloring waste";
        String location7 = "Tumkur";
        boolean isfull6 = true;
        int capacity4 = 60;
        String modelnumber3 = "KAX990";
        long lastCheck1 = 267584;
        String instructions = "Handle care";
        Pallet pallet11 = new Pallet(id11,weightlimit10,material8,location7,isfull6,capacity4,modelnumber3,
		lastCheck1,instructions);
        pallet11.display();

        String id12 = "666";
        double weightlimit11 = 676;
        String material9 = "black Stone";
        String location8 = "Chik manglore";
        boolean isfull7 = true;
        int capacity5 = 80;
        String modelnumber4 = "KAX554";
        long lastCheck2 = 678954;
        String instructions1 = "Be careful";
        boolean reusable = true;
        Pallet pallet12 = new Pallet(id12,weightlimit11,material9,location8,isfull7,capacity5,modelnumber4,
		lastCheck2,instructions1,reusable);
        pallet12.display();
    }
}
