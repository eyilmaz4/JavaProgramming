package collections;

import java.lang.reflect.Array;
import java.util.*;

public class ListWithDummyData {
    public static void main(String[] args) {
        String sentence="Java is Java and we love Java";
        String [] arr=sentence.split(" ");
        ArrayList<String> a=new ArrayList<>();
for(String word:arr){
    a.add(word);
}
HashSet<String>set=new HashSet<>();
for(String word:arr){
    set.add(word);
}
        System.out.println(Collections.frequency(a,"Java"));
        System.out.println(Collections.frequency(set,"Java"));//hashset doesn't accept duplicates

        /* hocadan
        public class WordFreq {
    public static void main(String[] args) {
        String str = "java is java is my java and my love";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word : list){
            hm.put(word, Collections.frequency(list,word));
        }
        System.out.println(hm);
    }

         */
    }
}
