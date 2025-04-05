package Com.Java.Village;

public class VillageRunner {
    public static void main(String[] args) {
        Poppulation poppulation=new Poppulation(1500,450);
        Poppulation poppulation1=new Poppulation(2500,5000);
        Poppulation[] poppulations={poppulation,poppulation1};
        Village village=new Village("Doddaullarthy","57737",poppulations);
        village.display();
    }
}
