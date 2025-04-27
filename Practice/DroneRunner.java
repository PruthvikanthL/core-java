public class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone("DJI Phantom 4","DJI","Quadcopter",1380,72,30,true,5000,"LiPo",true,true,6000,
		true,false,true,true,"Radio Frequency",4,false,1000);
        drone1.display();
		Drone drone2 = new Drone("Parrot Anafi","Parrot","Quadcopter",320,55,25,true,4000,"Li-Ion",false,true, 
		4500,false,true,true,true,"Wi-Fi",4,false,500);
        drone2.display();
		Drone drone3 = new Drone("Autel EVO II","Autel Robotics","Hexacopter",1150,72,40,true,9000,"LiPo",true,true,
		8000,false,true,true,true,"5G",6,true,2000);
        drone3.display();
    }
}
