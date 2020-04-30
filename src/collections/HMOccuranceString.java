package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HMOccuranceString {
    public static void main(String[] args) {
        HashMap<Character,Integer>hm=new HashMap<>();
        String word="Java";
        for(int i=0; i<word.length(); i++){
            if (hm.containsKey(word.charAt(i))){
                hm.put(word.charAt(i),hm.get(word.charAt(i)+1));
            }
            else {
                hm.put(word.charAt(i),1);
            }
        }
        System.out.println(hm);
        }

    }

