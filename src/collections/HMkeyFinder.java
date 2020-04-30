package collections;

import java.util.Arrays;
import java.util.HashMap;

public class HMkeyFinder {
    public static void main(String[] args) {
HashMap<Character, Character> map=new HashMap<>();
        map.put('a','A');
        map.put('b','B');
        map.put('c','C');
        System.out.println(map);
        findKey(map,'a');
    }
    public static void findKey(HashMap<Character, Character> map, char letter){
        boolean isKey=false;

        for(Character element:map.keySet()) {
            if (element.equals(letter)) {
                isKey = true;
                break;
            }
        }
            if(isKey){
                System.out.println("exist");
            }
            else
            {
                System.out.println("not exist");
            }
        }
    }
