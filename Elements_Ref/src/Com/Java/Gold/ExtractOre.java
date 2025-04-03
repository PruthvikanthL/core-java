package Com.Java.Gold;

public class ExtractOre {

    public ExtractOre(Gold gold){
        if(gold!=null){
        System.out.println("Running Extractore constructor");
        gold.refineGold();
        meltGold();}
        else{
            System.err.println("gold is null");
        }
    }
    public void meltGold(){
        System.out.println("Running meltagold method in Extractore");
    }
}
