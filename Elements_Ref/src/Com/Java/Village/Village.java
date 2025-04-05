package Com.Java.Village;

public class Village {
    private String Vil_name;
    private String pincode;
    private Poppulation[] pop;
    public Village(String vil_name,String pincode,Poppulation[] pop){
        this.pincode=pincode;
        this.Vil_name=vil_name;
        this.pop=pop;
    }
    public void display(){
        System.out.println("The villlage name is "+this.Vil_name);
        System.out.println("The pin code is"+this.pincode);
        for(Poppulation popu:pop){
            popu.show();
        }
    }
}
