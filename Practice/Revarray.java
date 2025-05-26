class Revarray{
public static void main(String[] args)
{  int[] num={10,20,30,40,50};
for(int i=0;i<num.length;i++){
	
System.out.println("The array Elements are \n");
System.out.println("The are arrya element @"+i+"is"+num[i]);
}
int start=0;
int end=num.length-1;
while(start<end){
	int temp=num[start];
	num[start]=num[end];
	num[end]=temp;
	start++;
	end--;
}
for(int i=0;i<num.length;i++){
	
System.out.println("Now we are printing Reversed array\n");
System.out.println("The Revesed array is @"+i+"is"+num[i]);
}
}}