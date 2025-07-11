public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={2,4,9,6,4,1,3};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
//Note:Here the Time complexiry is classified into three type where 1. if elements are sorted --> O(n) 2.Average case--> O(n^2) and 3.worst case O(n^2) input array is sorted in reverse order
// here swaping was not taking place here it take shifts like ex: if arr={2,4,5,1,8,10}
//int key=arr[i];
//            int j=i-1;
//            while(j>=0&&arr[j]>key){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
// according to this codition it was like compring key value with all elements
//ex:arr[j]>key --> if key=1 in this situation according to given array 5>1 --> true
// so array will starts shifting in this point arr[j+1]=arr[j]; is happend they array becomes 2,4,_,5,8,10
// 4>1-->true 2,_,4,5,8,10
//2>1--> true _,2,4,5,8,10
// at finally  arr[j+1]=key; this happens means by checking all j will becomes negtive -1 so we want assing the key value to 0 index right so this condition will helps to assign that
// finally 1,2,4,5,8,10 this our sorted array
