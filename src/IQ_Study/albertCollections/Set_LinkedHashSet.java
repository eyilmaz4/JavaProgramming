package IQ_Study.albertCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4, 7, 6, 9, 0, 8,6,8};
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("------------------");
        for (int a : arr
        ) {
            set.add(a);
        }
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n"+"LinkedHasSet gives Insertion Order");
        System.out.println("size is "+set.size());

        Set<Integer>hSet=new HashSet<>();
        for (int b:arr
             ) {
            hSet.add(b);
        }
        Iterator iterator1=hSet.iterator();
        System.out.println("-------------------------");
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println("\n"+"HashSet gives Ascending order");
        System.out.println("Size is "+hSet.size());
    }
}
