//! Problem :3
/*
 ? input
 *2 2
 *main 192.168.0.2
 *replica 192.168.0.1

 *block 192.168.0.1;
 *proxy 192.168.0.2;

 ? output
 *block 192.168.0.1; #replica
 *proxy 192.168.0.2; #main

 */

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        HashMap<String,String> hm=new HashMap<>();
        int n=sn.nextInt();
        int m=sn.nextInt();
        String[] arr=new String[10];
        String[] arr1=new String[10];
        //? garbeg input collector
        sn.nextLine();
        
        for (int i = 0; i < n; i++) {
            String ip1=sn.nextLine();
            arr=ip1.split(" ");
            hm.put(arr[1],arr[0]);
        }
        // 
        
        sn.nextLine();
        for (int i = 0; i < m; i++) {
            String ip2=sn.nextLine();
            arr1=ip2.split(" ");
            // System.out.println(arr1[1].replace(";",""));
            System.out.println(arr1[0]+" "+arr1[1]+" #"
                        +hm.get(arr1[1].replace(";","")));
        }

    }
    
}
