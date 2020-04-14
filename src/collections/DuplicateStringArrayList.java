package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> myStr=new ArrayList<String>(Arrays.asList("a","b", "c", "d", "a", "b"));
       ArrayList<String> newStr=new ArrayList<String>();
        for(String element:myStr){
            if(!newStr.contains(element)){
                newStr.add(element);
            }
        }
        System.out.println(newStr);
    }
}
