package Com.Java.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        System.out.println("Running SweetRunner main class");
         Sweet sweet=new Sweet();
    CheckSweetness checkSweetness=new CheckSweetness(sweet);
}}
