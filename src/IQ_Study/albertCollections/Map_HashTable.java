package IQ_Study.albertCollections;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

public class Map_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer>ht=new Hashtable<>();
        ht.put("Ankara",6);
        ht.put("Istanbul",34);
        ht.put("Sakarya",54);
        ht.put("Adana",1);

//        Iterator<String> iterator = ht.keySet().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println("Hashtable gives Random order, no matter what you enter");
        System.out.println(ht);
    }

}
