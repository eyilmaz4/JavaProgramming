package IQ_Study.albertCollections;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Map_LinkedHashTable {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
       lhm.put("Sakarya",54);
       lhm.put("Adana",1);
        System.out.println("LinkedHashMAp gives insertion order");
        System.out.println(lhm);
    }
}
