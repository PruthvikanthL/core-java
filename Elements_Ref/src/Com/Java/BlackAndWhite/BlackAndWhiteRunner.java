package Com.Java.BlackAndWhite;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        System.out.println("Running BlackandwhiteRunner main class");
        BlackAndWhite blackAndWhite=new BlackAndWhite();
        ConvertToBlackWhite convertToBlackWhite=new ConvertToBlackWhite(blackAndWhite);
    }
}
