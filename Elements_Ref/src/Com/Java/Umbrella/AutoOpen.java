package Com.Java.Umbrella;

public class AutoOpen {
    public AutoOpen(Umbrella umbrella){
        if(umbrella!=null){
        System.out.println("Running AutoOpen Constructor");
        umbrella.rainshield();
        waterrepel();}
        else{
            System.err.println("umbrella is null");
        }
    }
    public void waterrepel(){
        System.out.println("Running WaterRepel method in AutoOpen class");
    }
}
