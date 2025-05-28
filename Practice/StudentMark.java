import java.util.Scanner;
class StudentMark{
	public static void main(String[] args){
		
	
	Scanner sc=new Scanner(System.in);
	int total=0;
	int[] marks=new int[5];
	System.out.println("Enter the 5 subject marks buddy\n");
	for(int i=0;i<5;i++){
		marks[i]=sc.nextInt();
		
	}
	int highnu=marks[0];
	for(int i=0;i<5;i++){
		total=total+marks[i];
		
	}
	int avg=total/5;
	System.out.println("The total marks is "+total);
	System.out.println("The average of the  marks is "+avg);
	for(int i=0;i<5;i++){
		
	if(highnu<marks[i]){
		highnu=marks[i];
	}
	}
		System.out.println("highest score is "+highnu);

	
	
}
}