//! HashSet -> it doesn't allow duplicates
//!         -> Unordered Collection

//? hash code ->encrypted code


import java.util.HashSet;

public class useOfHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        System.out.println(hs);

        HashSet<String> hs1=new HashSet<>();
        hs1.add("Green");
        hs1.add("blue");
        hs1.add("orange");
        System.out.println(hs1);

    }

    
}
