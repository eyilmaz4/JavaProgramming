package HomeworkChallanges;

import abstraction.StaticC;

import java.util.HashMap;
import java.util.Map;

public class Hub {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "ac");
        map.put("c", "bd");
        if (map.containsKey("a") && !map.containsKey("b")) {
            System.out.println("yes");
        }
        System.out.println(mapAB2(map));
    }
        public static Map<String, String> mapAB2(Map<String, String> map) {
            if( map.get("a")==map.get("b")){

                map.remove("a");
                map.remove("b");
            }

            return map;

        }

    }

