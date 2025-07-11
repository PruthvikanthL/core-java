public class LinerAndBinarySearch {
    public static void main(String[] args) {
        int[] num={3,5,6,7,8,9,10,33,44,55};
        int target=100;
       int result=linearsearch(num,target);
       int reusltbinary=binarysearch(num,target);
       if(result!=-1){
           System.out.println("Element found at "+result);
       }
       else{
           System.out.println("Element not found ");
       }

    }

    private static int binarysearch(int[] num, int target) {
        int low=0;
        int high=num.length-1;
        int step=0;
        while(low<=high){
            step++;
            int mid=(low+high)/2;
            if(num[mid]==target){
                System.out.println("Steps taken in Binary is "+step);
                return mid;
            }
            else if(num[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        System.out.println("Steps taken in Binary is "+step);
        return -1;
    }
//Note:The Time Complexity for this binary is O(logn) because while comparing to this with linear it was takes less number of iterartions for example for 8 elements its takes 3 steps but in linear it takes 8 steps
    //in 2nd example for 16 elements is this takes 4 steps but that takes 16 steps binary works like (n log base 2 like if 8 elements so log base 2 8 =3  means simply follows 2*2*2=8 number of 2's is 3 like that
    private static int linearsearch(int[] num, int target) {
        int step=0;
        for(int i=0;i<num.length;i++){
            step++;
            if(num[i]==target){
                System.out.println("Steps taken in Liner is "+step);
                return i;
            }
        }
        System.out.println("Steps taken in Liner is "+step);
        return -1;
    }
    //Note:Order of the this linear search is O(n) because its need to search every element according to size increases the time is also increases for search
}


