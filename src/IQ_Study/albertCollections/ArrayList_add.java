package IQ_Study.albertCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_add {
    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5, 9, 3, 6, 0, 7};

        List<Integer> list = new ArrayList<>();
        for (int ak : arr
        ) {
            list.add(ak);
        }
        Iterator i=list.iterator();
        while(i.hasNext()){
           // System.out.print(i.next()+" ");
        }

    }
}
