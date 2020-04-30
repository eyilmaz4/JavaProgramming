package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapJavaSQL {
    public static void main(String[] args) {
        HashMap<String, String>hm=new HashMap<>();
        hm.put("Java","medium");
        hm.put("SQL","Entry");
        hm.put("Selenium","Master");
        hm.put("Cucumber","Expert");

        Iterator<String> iter=hm.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+":"+hm.get(key));
        }

    }
}
