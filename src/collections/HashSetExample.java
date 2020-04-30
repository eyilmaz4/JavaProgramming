package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        System.out.println(hs);
      String [] arr=new String [hs.size()];
      //  arr= hs.toArray().toString();
    }
}
