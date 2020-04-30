package collections;

import java.util.Arrays;
import java.util.HashSet;

public class HackerRankHashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        String [] allNames={"John Tom","John Mary","John Tom","Mary Ana", "Mary Ana"};
        for(int i=0; i<5; i++){
            hs.add(allNames[i]);
            System.out.println(hs.size());

        }
        /*import java.util.HashMap;
import java.util.HashSet;
​
public class HashSetHackerrank {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        String[] allnames = {"john tom","john mary","john tom","mary anna","mary anna"};
        for(int i=0 ; i<allnames.length ; i++){
            names.add(allnames[i]);
            System.out.println(names.size());
        }
    }
​
*/
    }
}
