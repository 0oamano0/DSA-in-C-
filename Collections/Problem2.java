//! Problem
/*
 ? {
 ? "icecream" : "vanilla",
 ? "choc" : "donut",
 ? "spanish" : null
 ?}
 
 ? Task : if icecream has a value update that value for key spanish
 ? Task : if choc has a value update value into kitkat
 
 ? {
 ? "icecream" : "vanilla",
 ? "choc" : "kitkat",
 ? "spanish" : "vanilla"
 ? }
 */

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            HashMap<String,String> hm =new HashMap<>();
            int n=sn.nextInt();
            String keyValue;
            String value;
            sn.nextLine();
            for (int i = 1; i <=n; i++) {
                keyValue=sn.nextLine();
                value=sn.nextLine();
                hm.put(keyValue,value);
            }
            
            
            // hm.put("icecream","vanilla");
            // hm.put("choc","donut");
            // hm.put("spanish",null);
            
            System.out.println(hm);
            hm.replace("choc","Kitkat");
            hm.replace("spanish",hm.get("icecream"));
            System.out.println(hm);


        }

    }
    
}
