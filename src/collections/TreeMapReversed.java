package collections;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapReversed {
    public static void main(String[] args) {
        TreeMap<Integer, Character> myTree=new TreeMap<>(Collections.reverseOrder());
       char letter='a';
        for(int i=0; i<27; i++){
            myTree.put(i,letter);
            letter++;

        }
        System.out.println(myTree);
    }
}
