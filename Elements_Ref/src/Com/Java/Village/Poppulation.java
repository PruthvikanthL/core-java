package Com.Java.Village;

public class Poppulation {
    int population;
    int no_homes;
    public Poppulation(int population,int no_homes){
        this.population=population;
        this.no_homes=no_homes;
    }
    public void show(){
        System.out.println("The population is"+this.population);
        System.out.println("The number of homes is"+this.population);
    }
}
