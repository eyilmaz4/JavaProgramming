package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsCopyExample {
    public static void main(String[] args) {
        LinkedList<Integer> myLink=new LinkedList<>();
        for(int i=0; i<51; i++){
            myLink.add(i,((int)(Math.random()*100)));
        }
        Collections.sort(myLink);
//copy method
     LinkedList<Integer> list=new LinkedList<>();
        Collections.copy(list, myLink);
        System.out.println(list);
    }
}
