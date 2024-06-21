//! Problem :4
/*
?TestCase : 1
ip:
1 3 3 10 2
op:
180 60 60 18 90

?TestCase : 2
ip:
1 2 3 4 5
op:
120 60 40 30 24
 */


import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[5];
        int[] arr1 =new int[5];
        int num=1;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            num=num*arr[i];
        }
        for(int i = 0; i < 5; i++) {
            arr1[i]=num/arr[i];
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        
        
    }
    
}
