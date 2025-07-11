public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={3,1,2,5,8,2};
        int size=nums.length;
        int temp;
        System.out.println("Elements of an array before the sorting");
        for(int n:nums){
            System.out.print(n+" ");
        }

        System.out.print("\nBubble sort Happening Steps");
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }

            }

            System.out.println();
            for (int n:nums){
                System.out.print(n+" ");

            }

        }
        System.out.println();
        System.out.println("Elements of an array after the sorting");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
//Note:The Time complexity for this bubble sort is O(n^2) it was appers middle in the Big - O Complexity Chart means it was not efficient
// here we are using in for(int j=0;j<size-i-1;j++) here j<size-i-1 why are we using this means at the last element while comparing it compare j<j+1 when its reaches the last it will goes index out of bound expetion for overcome that we are putting size-1
// and here we are using for(int j=0;j<size-i-1;j++) in this j<size-i-1 ( i also ) beacause while in 1st iteration the big element will goes to last so again and again is waste of proccessing time to compare last element anyhow the big element will goes to last right so
// here we are using two for loops first one for iterations (means like for one time by taking one element only we can beside element means at a time we can compre two elements only so for that anyhow we need to compare all elements individualy right for that
//Opinion: It was easy to understand but not efficient according to the time and storage it was not good
// while running this code you can gate the flow also how it was working under the message Bubble sort Happening Steps
