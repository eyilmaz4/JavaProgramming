package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add((int) (Math.random() * 1000));
        }
        Collections.sort(list);
        System.out.println(list);
        //smallest
        System.out.println("Smallest number is: "+list.get(0));
        // biggest
        System.out.println("Biggest number is:"+list.get(list.size()-1));
        //median
        System.out.println("median is: "+list.get((list.size()/2)));
        //smallest 3
        System.out.println("smallest 3 elements");
        for (int i = 0; i <= 2; i++) {
            System.out.print( list.get(i) + "\t");
        }
        System.out.println();
        System.out.println("biggest 3 elements");
        for (int i = list.size()-1; i >= list.size() - 3; i--) {
            System.out.print( list.get(i) + "\t");
        }
    }
}
