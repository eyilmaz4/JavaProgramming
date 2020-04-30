package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HMTemprature {
    public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("LA", 85);
        hm.put("NY", 78);
        hm.put("CH", 65);
        hm.put("HO", 90);


        Iterator<String> iter = hm.keySet().iterator();
        String key;
        while (iter.hasNext()) {
            key = iter.next();
            System.out.println(key + ":" + hm.get(key));
        }
            int average=0;
            for(int degree:hm.values()){
                average+=degree;
            }
            System.out.println("average temprature: "+average/hm.size());

        }
    }
