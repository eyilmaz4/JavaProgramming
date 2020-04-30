package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        Hashtable<String, String> ht=new Hashtable<>();
        hm.put(null, "one");
        hm.put("two", null);
        hm.put("three", null);
        System.out.println(hm);
       //hashtable doesnt allow null key or value!!
//        ht.put(null, "one");
//        ht.put("two", null);
//        ht.put("three", null);
//        System.out.println(ht);
    }
}
