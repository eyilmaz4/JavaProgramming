package IQ_Study;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LLIterator {
    public static void main(String[] args) {

       // ListIterator<String>litr=null;
        List<String> names= new ArrayList<>();
        names.add("Ayse");
        names.add("Fatma");
        ListIterator<String>litr=names.listIterator();
       // litr= names.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        ll();
    }
    public static void ll(){
        ListIterator<Integer>numbers=null;
        List<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        numbers= nums.listIterator();
        while(numbers.hasNext()){
            System.out.println(numbers.next());
        }
        while(numbers.hasPrevious()){
            System.out.println(numbers.previous());
        }

    }
}
