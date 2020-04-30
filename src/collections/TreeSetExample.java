package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(10);
        try {
            ts.add(null);
        }
        catch (NullPointerException e){
            System.out.println("please do not add null value");
        }
        ts.add(5);
        ts.add(90);
        ts.add(20);
        System.out.println(ts);

        Iterator<Integer>iter=ts.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
