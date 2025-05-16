public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth","Terrestrial",6371,150,true,1,false,9.8,false,"Blue",true,true,true, 
		"Oxygen",24,365,false,true,"ancient times",1400);
        planet1.display();
		Planet planet2 = new Planet("Mars","Terrestrial",3389,227,false,2,false,3.7,false,"Red",true,false,
		true,"Carbon Dioxide",25,687,false,false,"Galileo",1610);
        planet2.display();
		Planet planet3 = new Planet("Jupiter","Gas Giant",69911,778,false,79,true,24.8,false,"Brown",false,false,
		true,"Hydrogen",10,4333,true,true,"Galileo",1610);
        planet3.display();
    }
}
