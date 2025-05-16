class PosterConsRunner {
    public static void main(String[] args) {
        PosterCons poster1 = new PosterCons();
        poster1.display();

        String posterConsId2 = "P001";
        PosterCons poster2 = new PosterCons(posterConsId2);
        poster2.display();

        String posterConsId3 = "P002";
        double height3 = 24.5;
        PosterCons poster3 = new PosterCons(posterConsId3,height3);
        poster3.display();

        String posterConsId4 = "P003";
        double height4 = 30.0;
        String material4 = "Canvas";
        PosterCons poster4 = new PosterCons(posterConsId4,height4,material4);
        poster4.display();

        String posterConsId5 = "P004";
        double height5 = 20.0;
        String material5 = "Paper";
        String theme5 = "Nature";
        PosterCons poster5 = new PosterCons(posterConsId5,height5,material5,theme5);
        poster5.display();

        String posterConsId6 = "P005";
        double height6 = 18.0;
        String material6 = "Vinyl";
        String theme6 = "Abstract";
        boolean isFramed6 = true;
        PosterCons poster6 = new PosterCons(posterConsId6,height6,material6,theme6,isFramed6);
        poster6.display();

        String posterConsId7 = "P006";
        double height7 = 22.5;
        String material7 = "Cloth";
        String theme7 = "Portrait";
        boolean isFramed7 = false;
        int width7 = 15;
        PosterCons poster7 = new PosterCons(posterConsId7,height7,material7,theme7,isFramed7,width7);
        poster7.display();

        String posterConsId8 = "P007";
        double height8 = 28.0;
        String material8 = "Glossy Paper";
        String theme8 = "Movie";
        boolean isFramed8 = true;
        int width8 = 20;
        String artist8 = "James Smith";
        PosterCons poster8 = new PosterCons(posterConsId8,height8,material8,theme8,isFramed8,width8,artist8);
        poster8.display();

        String posterConsId9 = "P008";
        double height9 = 35.0;
        String material9 = "Silk";
        String theme9 = "Fantasy";
        boolean isFramed9 = false;
        int width9 = 25;
        String artist9 = "Anna Taylor";
        String color9 = "Blue";
        PosterCons poster9 = new PosterCons(posterConsId9,height9,material9,theme9,isFramed9,width9,artist9,
		color9);
        poster9.display();

        String posterConsId10 = "P009";
        double height10 = 40.0;
        String material10 = "Matte Paper";
        String theme10 = "Sci-Fi";
        boolean isFramed10 = true;
        int width10 = 30;
        String artist10 = "David Brown";
        String color10 = "Red";
        int year10 = 2021;
        PosterCons poster10 = new PosterCons(posterConsId10,height10,material10,theme10,isFramed10,width10,
		artist10,color10,year10);
        poster10.display();

        String posterConsId11 = "P010";
        double height11 = 50.0;
        String material11 = "Polyester";
        String theme11 = "Classic";
        boolean isFramed11 = true;
        int width11 = 40;
        String artist11 = "Michael Johnson";
        String color11 = "Green";
        int year11 = 2019;
        double price11 = 499.99;
        PosterCons poster11 = new PosterCons(posterConsId11,height11,material11,theme11,isFramed11,width11,artist11,
		color11,year11,price11);
        poster11.display();
    }
}
