package collections;

import java.util.HashMap;

public class IsKeyHas {
    public static void main(String[] args) {
        HashMap<Character,Character>map=new HashMap<>();
        map.put('a','A');
        map.put('b','B');
        map.put('c','C');
        System.out.println(isKey(map,'c'));
        System.out.println(isKey(map,'d'));

    }
    public static boolean isKey(HashMap<Character,Character>hm,char letter){
       boolean result=false;
        for(char key:hm.keySet()){
            if(letter==key){
                result=true;
            }
        }
        return result;
    }
    /*
    ​
public class HashMapKey {
    public static void main(String[] args) {
        HashMap<String,String > hashMap = new HashMap<>();
        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        System.out.println(isKeyHas(hashMap,"D"));
    }
    public  static boolean isKeyHas(HashMap<String,String> hm, String key){
        boolean result=false;
        Iterator<String> iterator = hm.keySet().iterator();
        while(iterator.hasNext()){
            if (key.equals(iterator.next())){
                result = true;
​
            }
        }
        return result;
    }

     */
}
