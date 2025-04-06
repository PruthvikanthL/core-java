class Arrpalin{
public static void main(String[] args){
int[] arr={1,2,1,3,1};
int start=0;
int end=arr.length-1;
boolean flag=true;
while(start<end){
	if(arr[start]!=arr[end]){
		flag=false;
		break;
	}
	start++;
	end--;
}
if(flag){
	System.out.println("The Given Array is a palindrome");
}
else 
{
	System.out.println("The Given Array is not a Palindrome");
}
}


}