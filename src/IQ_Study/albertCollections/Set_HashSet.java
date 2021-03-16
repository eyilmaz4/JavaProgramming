package IQ_Study.albertCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        int []arr={3,2,5,6,8,5,1,0,0,8};
        Set<Integer>set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);

        }
        System.out.println(set.size());

Iterator iterator= set.iterator();
    while(iterator.hasNext()){
        System.out.print(iterator.next()+" ");
    }
        }
    }

