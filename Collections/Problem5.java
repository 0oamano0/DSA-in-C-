

//! Problem : 5
//? Find the largest no. in a given array without using 
//? looping and without using predefined function

//? Note :for collecting use looping


import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i= 0; i <n; i++) {
           arr[i]=sc.nextInt();
        }

        int max=findLargest(arr,n,arr[0],0);
        System.out.println(max);
       
    }


    //? Recursion Method
    
    private static int findLargest(int[] arr, int n, int max, int pos) {

        // pos=0 max=10 n=5 arr[pos]=10
        if(pos==n){
            return max;
        }
        if(max<arr[pos]){
            max=arr[pos];
        }
        return findLargest(arr, n, max, pos+1);
    }


}
