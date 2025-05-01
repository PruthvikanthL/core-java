class Fact{
	public static void main(String[] args){
		int[] arr={3,5,6,7,9,10};
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int fact=1;
			for(int j=1;j<=num;j++){
				fact=fact*j;
			}System.out.println("The factorial of a number\t "+num+"is\t"+fact);
		}
		
	}
}