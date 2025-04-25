public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Dairy Milk", "Cadbury", "Milk Chocolate",150,3.99,false,false,false,
		30,true,false,false,true,"UK","Wrapper",12,false,false,"1905");
        chocolate1.display();
		Chocolate chocolate2 = new Chocolate("KitKat","Nestlé","Wafer Chocolate",42,1.49,false,false,false,25,
		false,true,false,false,"Switzerland","Bar",15,false,false,"1935");
        chocolate2.display();
		Chocolate chocolate3 = new Chocolate("Lindt Excellence 85%","Lindt","Dark Chocolate",100,4.99,false,true,true,
		85,false,false,true,true,"Switzerland","Box",18,false,false,"1989");
        chocolate3.display();
    }
}
