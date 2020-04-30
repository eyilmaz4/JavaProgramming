package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>newList=new ArrayList<>();
        for(int i=0; i<101; i++){
            if(!(i%2==0)){
                newList.add(i);
            }
        }
        Iterator<Integer> iterator=newList.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
