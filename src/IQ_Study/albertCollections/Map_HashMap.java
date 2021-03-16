package IQ_Study.albertCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> lhm=new HashMap<>();
        lhm.put("Ankara",6);
        lhm.put("Istanbul",34);
        lhm.put("Sakarya",54);
        lhm.put("Adana",1);

        System.out.println("HashMap does not maintain any order");
        System.out.println(lhm);
    }
}
