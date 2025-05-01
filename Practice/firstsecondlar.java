class firstsecondlar{
	public static void main(String[] args){
		int[] arr={20,22,11,23,5,60};
		int firstlarge=arr[0];
		int secondlarge=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>firstlarge){
				secondlarge=firstlarge;
				firstlarge=arr[i];
				
			}
			
			
		}
		System.out.println("The first largest number in the given array is "+firstlarge);
		System.out.println("The first largest number in the given array is "+secondlarge);

	}
}