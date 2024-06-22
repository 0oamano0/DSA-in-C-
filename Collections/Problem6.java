//! Problem : 6  ->Arrray manipulation
//*    Testcase 1       Testcase 2       Testcase 3
//!    ip1:             ip1:             ip1:
//?    5 3              4 3              5 4
//!    ip2:             ip2:             ip2:
//?    1 2 100          1 3 100          1 2 100
//?    2 4 100          2 3 100          3 4 100
//?    3 5 100          3 4 200          2 3 100
//?                                      3 5 100
//!    op:200           op:400           op:300

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<d;i++){
                int st =sc.nextInt();
                int en=sc.nextInt();
                int val=sc.nextInt();
                for (int j =st-1; j < en; j++) {
                    arr[j]+=val;
                }
                // System.out.println(Arrays.toString(arr));
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
        }


    }
    
}
