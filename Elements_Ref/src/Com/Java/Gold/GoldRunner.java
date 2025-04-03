package Com.Java.Gold;

public class GoldRunner {
    public static void main(String[] args) {
        System.out.println("Running Main class");
        Gold gold=new Gold();
        ExtractOre extractOre=new ExtractOre(gold);
    }
}
