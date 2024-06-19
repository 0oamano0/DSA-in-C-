//! Check the given array is good or bad based on given condition
//? n=5
//? arr=[1,3,4,5,6]

//Condition
/*
 ? elements in array should be 1 to n
 ? No duplicated allowed 
 ? Should not be in ascending
 ? [5,4,3,2,1] =>good
 ? [5,4,1,3,2] =>good
 ? [1,2,3,4,5] =>bad
 */

//! Use Array and HashSet

import java.util.HashSet;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);
        boolean condition =true;

        //?Collect n
        int n=sn.nextInt();

        //? Collect array
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sn.nextInt();
        }

        //? Initialize two HashSet
        HashSet<Integer> h1 =new HashSet<>();
        HashSet<Integer> h2 =new HashSet<>();

        //? In h1 add elements from 1 to n
        for (int i = 1; i <=n; i++) {
            h1.add(i);
        }
        System.out.println(h1);

        //? Add element from array to h2
        for (int i = 0; i <n; i++) {
            h2.add(arr[i]);
        }
        System.out.println(h2);

        //?Compare size of array and h2
        if(arr.length!=h2.size()){
            condition=false;
        }

        //? Compare h1 and h2
        if(h1!=h2){
            condition=false;
        }
        System.out.println(condition);
       
        
        sn.close();
    }
    
}
