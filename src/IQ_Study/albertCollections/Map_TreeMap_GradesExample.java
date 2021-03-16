package IQ_Study.albertCollections;

import java.util.Iterator;
import java.util.TreeMap;

public class Map_TreeMap_GradesExample {
    public static void main(String[] args) {
        TreeMap<String, Integer>map=new TreeMap<>();
        map.put("Piper",99);
        map.put("Elif",100);
        map.put("Elif",10);
        map.put("Elif",100);
        map.put("Ela",86);
        map.put("Lucas",60);
        for (String a:map.keySet()
             ) {
            System.out.println(a+map.get(a));
        }

        Iterator<String>iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String k= iterator.next();
            System.out.println(k+" = "+map.get(k));
            }

        }

    }

