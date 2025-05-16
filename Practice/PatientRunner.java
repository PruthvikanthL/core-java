class PatientRunner{
public static void main(String[] args){
Patient patient=new Patient();
System.out.println("The Default value for name "+patient.name);
System.out.println("The Default value for age"+patient.age);
System.out.println("The Default value for disease"+patient.disease);
System.out.println("The Default value for admitted"+patient.admitted);
patient.name="chiru";
patient.age=20;
patient.disease="corona";
patient.admitted=true;
System.out.println("The name value for name "+patient.name);
System.out.println("The age value for age"+patient.age);
System.out.println("The disease value for disease"+patient.disease);
System.out.println("The admitted value for admitted"+patient.admitted);

}


}