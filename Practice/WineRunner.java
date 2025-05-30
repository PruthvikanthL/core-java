class WineRunner {
    public static void main(String[] args) {
        Wine wine1 = new Wine();
        wine1.display();

        String name2 = "Cabernet Sauvignon";
        Wine wine2 = new Wine(name2);
        wine2.display();

        String name3 = "Merlot";
        String type3 = "Red";
        Wine wine3 = new Wine(name3, type3);
        wine3.display();

        String name4 = "Chardonnay";
        String type4 = "White";
        String origin4 = "France";
        Wine wine4 = new Wine(name4, type4, origin4);
        wine4.display();

        String name5 = "Pinot Noir";
        String type5 = "Red";
        String origin5 = "France";
        int year5 = 2015;
        Wine wine5 = new Wine(name5, type5, origin5, year5);
        wine5.display();

        String name6 = "Riesling";
        String type6 = "White";
        String origin6 = "Germany";
        int year6 = 2018;
        double alcoholContent6 = 11.5;
        Wine wine6 = new Wine(name6, type6, origin6, year6, alcoholContent6);
        wine6.display();

        String name7 = "Zinfandel";
        String type7 = "Red";
        String origin7 = "USA";
        int year7 = 2017;
        double alcoholContent7 = 14.0;
        String flavor7 = "Fruity";
        Wine wine7 = new Wine(name7, type7, origin7, year7, alcoholContent7, flavor7);
        wine7.display();

        String name8 = "Sauvignon Blanc";
        String type8 = "White";
        String origin8 = "New Zealand";
        int year8 = 2020;
        double alcoholContent8 = 12.5;
        String flavor8 = "Crisp";
        String winery8 = "Cloudy Bay";
        Wine wine8 = new Wine(name8, type8, origin8, year8, alcoholContent8, flavor8, winery8);
        wine8.display();

        String name9 = "Malbec";
        String type9 = "Red";
        String origin9 = "Argentina";
        int year9 = 2016;
        double alcoholContent9 = 13.5;
        String flavor9 = "Bold";
        String winery9 = "Catena Zapata";
        double price9 = 25.99;
        Wine wine9 = new Wine(name9, type9, origin9, year9, alcoholContent9, flavor9, winery9, price9);
        wine9.display();

        String name10 = "Tempranillo";
        String type10 = "Red";
        String origin10 = "Spain";
        int year10 = 2019;
        double alcoholContent10 = 13.0;
        String flavor10 = "Smooth";
        String winery10 = "Vega Sicilia";
        double price10 = 50.99;
        boolean isAged10 = true;
        String foodPairing10 = "Steak";
        Wine wine10 = new Wine(name10, type10, origin10, year10, alcoholContent10, flavor10, winery10, price10, isAged10, foodPairing10);
        wine10.display();
    }
}
