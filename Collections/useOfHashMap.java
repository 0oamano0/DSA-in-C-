import java.util.*;

public class useOfHashMap {
    public static void main(String[] args) {

        try (//!----------------------------------------------------------------------------
        // HashMap<Integer,String> hm=new HashMap<>();
        // //? Insert Element
        // hm.put(101, "a");
        // hm.put(102, "b");
        // hm.put(102, "c");
        // hm.put(103, "d");
        // System.out.println(hm);
        // //? I want "c" we will use key 102
        // System.out.println(hm.get(102));
        // System.out.println(hm.get(104)); //* Shows null value
        // hm.put(103, "AKs");
        // System.out.println(hm);
        // //? Replace value
        // hm.replace(103, "d");
        // System.out.println(hm);
        // //? Check key is there or not
        // System.out.println(hm.containsKey(103));
        // System.out.println(hm.containsKey(106));
        // //? if value is not present it will add the value
        // hm.putIfAbsent(103, "d");
        // System.out.println(hm);
        // hm.putIfAbsent(104, "k");
        // System.out.println(hm);
        // hm.putIfAbsent(108, "k");
        // System.out.println(hm);
        // hm.putIfAbsent(108, "m");
        // System.out.println(hm);
        // //? Iterate hashmap keys and value
        // //todo : key -> to know keys only
        // System.out.println(hm.keySet());
        // //todo : values -> to know values only
        // System.out.println(hm.values());
        // //? Iterate hashmap's both keys and value
        //// for(String ele : arr){
        ////     System.out.println(ele);
        //// }
        // //! method :1
        // for(Map.Entry<Integer,String> m : hm.entrySet()){
        //     System.out.println(m.getKey()+" : "+m.getValue());
        // }
        // //! Method :2
        // //? hm.forEach(() -> //Statement or condition)
        // hm.forEach((k,v)->System.out.println(k+"::"+v));
        // //! Method :3
        // //? Iterate key and values based on keys
        // for(int i :hm.keySet()){
        //     System.out.println(i+":::"+hm.get(i));
        // }
//! ----------------------------------------------------------------
        //? Collect name phone number
            Scanner sn = new Scanner(System.in)) {
            int n=sn.nextInt();
            String[] name=new String[n];
            long[] phno=new long[n];
            for (int i = 0; i < n; i++) {
                name[i]=sn.next();
            }
            for (int i = 0; i < n; i++) {
                phno[i]=sn.nextLong();
            }
            HashMap<String,Long> hm=new HashMap<>();
            for (int i = 0; i < n; i++) {
                hm.put(name[i],phno[i]);
            }
            System.out.println(hm);
        }

    }
    
}


//todo: HashMap
/*
?key :value pair
?    "dept" : "IT"
?    "dept" : "CSE"
 * 
 */

/*
 ! Repersentation : HashMap<k,v>
 ? eg : HashMap<Integer,Integer> hm1=new HashMap<>();
 ? eg : HashMap<String,Integer> hm2=new HashMap<>();
 ? eg : HashMap<String,String> hm2=new HashMap<>();
 ? eg : HashMap<Inteher,String> hm2=new HashMap<>();
 ? eg : HashMap<Student,String> hm2=new HashMap<>();
 ? eg : HashMap<Integer,Student> hm2=new HashMap<>();
 */

//! Note : Key Should be unique