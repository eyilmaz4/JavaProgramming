package IQ_Study;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CB_Bully_Map {
    public static void main(String[] args) {
        TreeMap<String, String>map=new TreeMap<>();
        map.put("a","cash");
        map.put("b","card");
        map.put("c","str");
        nextKey(map);

    }
    public static void nextKey(TreeMap<String, String> map){

       // for (int i = 0; i < map.keySet().size(); i++) {
            if (map.containsKey("a") && !map.get("a").equals(" ")){
                map.put("b",map.get("a"));
                map.put("a","\" \"");
            }


        System.out.println(map);
    }
}
