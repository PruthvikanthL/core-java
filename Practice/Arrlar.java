class Arrlar{
public static void main(String[] args){
int[] arr={1,2,3,4,5};
int lararr=arr[0];
int secondlar=0,thirdlar=0;
for(int i=0;i<arr.length;i++){
	if(lararr<arr[i]){
		thirdlar=secondlar;
		secondlar=lararr;
		lararr=arr[i];
		
	}
}
System.out.println("The Biggest number is"+lararr);
System.out.println("The 2nd Biggest number is"+secondlar);
System.out.println("The 3rd Biggest number is"+thirdlar);



}

}