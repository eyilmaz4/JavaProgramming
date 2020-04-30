package collections;

import java.util.HashMap;

public class HMStringOccurance {
    public static void main(String[] args) {
        String a="abcddeefcgg";
        findStringOccurance(a);
        method2("aaabbbcce");

    }

    public static void findStringOccurance(String word) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        char key;
        int value;
        for (int i = 0; i < word.length(); i++) {
            key = word.charAt(i);
            if (myMap.containsKey(key)) {
                value = myMap.get(key);
                myMap.put(key, value + 1);
            } else {
                myMap.put(key, 1);
            }
        }
        System.out.println(myMap);
    }
    public static void method2(String word){
        HashMap<Character, Integer>myMap=new HashMap<>();
        for(int i=0; i<word.length(); i++){
            if(!(myMap.containsKey(word.charAt(i)))){
                myMap.put(word.charAt(i),1);
            }
            else{
                myMap.put(word.charAt(i),(myMap.get(word.charAt(i)))+1);
            }
        }
        System.out.println(myMap);
    }
}
