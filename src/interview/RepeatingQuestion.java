package interview;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RepeatingQuestion {
    public static void main(String[] args) {
        String word = "HelloWorldw";
        word=word.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        char[] letters = word.toCharArray();
        int counter = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    counter++;

                }

            }
            map.put(letters[i], counter);
            counter = 0;

        }
        System.out.println(map);


//        int [] arr=new int[word.length()];
//        for(int i=0; i<word.length(); i++){
//            for (int j = i+1; j < word.length(); j++) {
//                if((word.charAt(i)==word.charAt(j))){
//                    arr[i]+=1;
//                }
//
//            }
//
//        }
//        for (int k : arr) {
//            System.out.println(k);
//
//        }
//    }
    }
}