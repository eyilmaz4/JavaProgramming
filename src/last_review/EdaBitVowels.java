package last_review;

import java.util.Arrays;
import java.util.HashSet;

public class EdaBitVowels {
    public static void main(String[] args) {
        String [] a={"toe","ocelot", "maniac"};
        System.out.println(Arrays.toString(sameVowelGroup(a)));
    }
    public static String[] sameVowelGroup(String[] words) {

        String vowels="aeoui";
        HashSet<String>hs=new HashSet<>();
        for(String k:words){
            if(k.contains(vowels)){
                hs.add(k);
            }
        }
        System.out.println(hs);
    String [] brr=new String[hs.size()];

        int index=0;
        for(String a:hs){
    brr[index]=a;
    index++;
        }
        return brr;
    }
    /*
    public class EdabitVowels {
    public static void main(String[] args) {
        String sentence[] = {"toe","ocelot","care","race","india"};
        printSameVowels(sentence);
    }
    public static boolean hasSameVowels(String first, String second){
        String vowels="aeoui";
        HashSet<String> hsFirst = new HashSet<>();
        HashSet<String> hsSecond = new HashSet<>();
        for (int i = 0; i < first.length(); i++) {
            if(vowels.contains(first.substring(i,i+1))){
                hsFirst.add(first.substring(i,i+1));
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if(vowels.contains(second.substring(i,i+1))){
                hsSecond.add(second.substring(i,i+1));
            }
        }
        if(hsFirst.equals(hsSecond)){
            return true;
        }
        else {
            return false;
        }
    }
​
    public static void printSameVowels(String arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(hasSameVowels(arr[i],arr[j])){
                    System.out.println(arr[i]+"\t"+arr[j]);
                }
            }
        }
    }

     */
}
