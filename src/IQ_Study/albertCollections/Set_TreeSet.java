package IQ_Study.albertCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        String [] arr2={"Baba ","bib ","east ","zebra ","can "};
        Set<String>lSset=new LinkedHashSet<>();
        for (String k:arr2 ) {
            lSset.add(k);
        }
        System.out.println("LinkedHashSet insertion order");
        lSset.forEach(System.out::print);
        System.out.println(" ");

        Set<String>tSset=new TreeSet<>();
        for (String t:arr2) {
            tSset.add(t);
        }
        System.out.println("TreeSet --> Ascending order");
        tSset.forEach(System.out::print);
        System.out.println(" ");

        int [] arr={8,1,0,0,9,2,4,6,3,7,7};
        Set<Integer>tSet=new TreeSet<>();
        for (int a:arr) {
            tSet.add(a);
        }
        System.out.println("\n"+"TreeSet gives Ascending order and it is faster");
        Iterator iterator=tSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("Size is "+tSet.size());
    }
}
