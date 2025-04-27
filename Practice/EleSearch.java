class EleSearch{
	public static void main(String[] args){
		int[] Ele={12,21,23,33,35};
		int key=36;
		boolean matched=false;
		for(int i=0;i<Ele.length;i++){
			if(key==Ele[i]){
				System.out.println("The Target Element was found @"+i+"is"+Ele[i]);
				matched=true;
		}		}
		if(matched==false){
			System.out.println("The Target Element is not found\t"+key);
		}
	}
}