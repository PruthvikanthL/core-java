public class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("PSLV","Chandrayana 3","INDIA",2024,true,2,70,550,7600.0,"RP-1",22800,
		false,27000,true,true,true,"Cape Canaveral",true,250,245);
        rocket1.display();
		Rocket rocket2 = new Rocket("Saturn V","NASA","USA",1967,false,3,110,2800,35000.0,"RP-1",140000,true,
		39800,false,true,true,"Kennedy Space Center",true,13,13);
        rocket2.display();
		Rocket rocket3 = new Rocket("Soyuz","RKK Energia","Russia",1966,false,3,50,305,1020.0,"Kerosene/LOX",7100,
		true,28000,false,true,true,"Baikonur Cosmodrome",true,1700,1650);
        rocket3.display();
    }
}
