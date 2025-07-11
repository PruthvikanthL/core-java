public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={3,2,6,10,4,3};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.print("Elements before Swapping");
        for(int n:nums){
            System.out.println(n+" ");
        }
        for(int i=0;i<size-1;i++){
             minIndex=i;
            for(int j=i+1;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
                temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;
                System.out.println();
                for(int n:nums){
                    System.out.print(n+" ");
                }
            }
        }



        System.out.println("\nElements after Swapping");
        for(int n:nums){
            System.out.print(n+" ");
        }

    }
}
//Note:The Time complexity for this also same as Bubble sort the main difference is insted of swaping everytime of elements in this just compares either it may be the max value or min values users wish
// it was just compares if any values which is higher or lower comes then only it was swaps and puts according to last of first ( if your dealing wiht min values it was startes putting from the 0 index if max values starts putting from the num.lenght values
//here in the for loop for i i was ends to size -1 anyhow last element we put greater only right so insted of itreate again it saves the 1 extra iterate
//in this for(int j=i+1;j<size;j++) is was starts comparing with i+1 beacuse anyhow its need to compare with beside one right so by incresing by 1 we can get that and compare
// ovarall strategy is it was reduced the number of swaps everytime which helpful for the saving the storage and time little bit