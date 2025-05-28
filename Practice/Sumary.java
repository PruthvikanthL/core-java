class Sumary{
	public static void main(String[] args){
		int[] sumar={10,11,12,13,14};
		int sum=0;
		for(int i=0;i<sumar.length;i++){
			
			sum=sum+sumar[i];
		}
		System.out.println("The sum of array is\n"+sum);
	}
}