public class SatellitesRunner {
    public static void main(String[] args) {
        Satellites satellite1 = new Satellites("Hubble Space Telescope","USA","Observational",1990,true,547,"Low Earth Orbit",
		false,11110,30,"NASA & ESA",true,0,false,false,false,true,true,"Space Shuttle Discovery",
		"Kennedy Space Center");
        satellite1.display();
		Satellites satellite2 = new Satellites("NavIC","India","Navigation",2016,true,36000,"Geostationary Orbit",false,1425,12,"ISRO",
		true,7,true,false,true,false,false,"PSLV-C33","Satish Dhawan Space Centre");
        satellite2.display();
		Satellites satellite3 = new Satellites("Sentinel-2","Europe","Earth Observation",2015,true,786,"Sun-Synchronous Orbit",
		false,1140,15,"ESA",true,13,false,false,false,false,true,"Vega Rocket","Kourou, French Guiana");
        satellite3.display();
    }
}
