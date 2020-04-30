package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Repetition3Digits {
    public static void main(String[] args) {
String word="window";
String word1=word.substring(0,3);
        System.out.println(word1);
        findRepeat("1234123512334234341");
    }
    public static void findRepeat(String number){
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>a=new ArrayList<>();
        for(int i=0; i<number.length()-3; i++){
            a.add(number.substring(i,(i+3)));

            }
        System.out.println(a);
        int count=0;

        for(int i=0; i<a.size();i++){
            count=0;
            for(int j=i+1; j<a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                    map.put(a.get(i), count);
                    System.out.println(map);
                }

            }
        }
        System.out.println(map);
        }

    }
