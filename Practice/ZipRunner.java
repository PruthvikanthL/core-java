public class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip("YKK","Nylon",20,"Black",true,false,"Coil","Jackets","Japan",true,false,true,"Durable and smooth operation",
		3.99,"Japan");
        zip1.display();
		Zip zip2 = new Zip("Coats Opti","Metal",25,"Silver",false,true,"Metal Tooth","Jeans","UK",false,false,
		false,"Strong and long-lasting",4.50,"United Kingdom");
        zip2.display();
		Zip zip3 = new Zip("Ideal Fastener","Plastic",30,"Blue",true,false,"Molded Plastic","Backpacks","USA",
		true,true,false,"Lightweight and flexible",2.75,"United States");
        zip3.display();
    }
}
