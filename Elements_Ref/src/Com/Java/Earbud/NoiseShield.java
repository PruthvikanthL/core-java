package Com.Java.Earbud;

public class NoiseShield {
    public NoiseShield(Earbud earbud){
        if(earbud!=null) {
            System.out.println("Running NoiseShield  constructor ");
            earbud.SoundBoost();
            autopair();

        }
        else{
            System.err.println("Earbud is null");
        }
    }
    public void autopair(){
        System.out.println("Running AutoPair method in NoiseShield");
    }
}
