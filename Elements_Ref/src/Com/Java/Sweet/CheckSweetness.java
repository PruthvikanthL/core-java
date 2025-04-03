package Com.Java.Sweet;

public class CheckSweetness {
    public CheckSweetness(Sweet sweet){
        if(sweet!=null){
        System.out.println("Running CheckSweetness constructor");
        sweet.meltCandy();
        addSugar();}
        else{
            System.err.println("sweet is null");
        }
    }
    public void addSugar(){
        System.out.println("Running  addsugar method in Checksweetness class");
    }
}
