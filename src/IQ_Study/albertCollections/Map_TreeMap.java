package IQ_Study.albertCollections;

import java.util.HashMap;
import java.util.TreeMap;

public class Map_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> lhm=new TreeMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
        lhm.put("Sakarya",54);
        lhm.put("Adana",1);
        lhm.put("Sivas",null);
        //lhm.put(null,3); ** no null key

        System.out.println("TreeMap is sorted ascending order according to keys");
        System.out.println(lhm);
    }
}
