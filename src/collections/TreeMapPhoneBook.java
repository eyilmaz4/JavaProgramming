package collections;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapPhoneBook {
    public static void main(String[] args) {
        TreeMap<String, Integer>map=new TreeMap<>();
        map.put("Esra", 123);
        map.put("Birsen",234);
        map.put("Fatma", 345);

        System.out.println(map);
        Iterator<String>iter=map.keySet().iterator();
        String key;
        while(iter.hasNext()){
        key=iter.next();
            System.out.println(key+" "+map.get(key));
        }
    }
}
