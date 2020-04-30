package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsSortExample {
    public static void main(String[] args) {
        LinkedList<Integer> myLink=new LinkedList<>();
        for(int i=0; i<51; i++){
            myLink.add(i,((int)(Math.random()*100)));
        }
        Collections.sort(myLink);
        System.out.println(myLink);
        Collections.sort(myLink,Comparator.reverseOrder());
        System.out.println(myLink);

        Iterator<Integer> iter=myLink.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next()+"\t");

        }

}
    }
