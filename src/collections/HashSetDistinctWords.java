package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDistinctWords {
    public static void main(String[] args) {
        String s="Java is Java";
        findDistinct(s);
    }
    public static void findDistinct(String sentence){
        HashSet<String>hs=new HashSet<>();
        String []arr=sentence.split(" ");
        for(String word:arr){
            hs.add(word);
        }
        Iterator<String>iter=hs.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(hs);
    }
}
