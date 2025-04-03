package Com.Java.BlackAndWhite;

public class ConvertToBlackWhite {
    public ConvertToBlackWhite(BlackAndWhite blackAndWhite){
        if(blackAndWhite!=null){
        System.out.println("Runnnig Converttoblackwhite constructor");
        blackAndWhite.detectShades();
        adjustContrast();}
        else{
            System.err.println("Blackandwhite is null");
        }

    }
    public void adjustContrast(){
        System.out.println("Running adjustContrast method in convertBlacktowhite class");
    }
}
