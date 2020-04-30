package collections;

import java.util.HashMap;

public class FirstHashMap {
    public static void main(String[] args) {


        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Java","medium");
        myHashMap.put("SQL","entry");
        myHashMap.put("Selenium","master");
        myHashMap.put("Cucumber","expert");
        System.out.println(myHashMap);

        for(String key :myHashMap.keySet()){
            System.out.println(key+"\t"+myHashMap.get(key));}

        }

}