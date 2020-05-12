package last_review;

import java.io.File;
import java.util.*;

public class CollectionsEx1 {
    public static void main(String[] args) {
        List<A>list=new ArrayList<>();
        A a=new A(10,"red");
        list.add(a);
        System.out.println(list.get(0).color);
        System.out.println(list.get(0).size);
        List<HashMap<Integer,Integer>>list2=new ArrayList<>(20);
//        List</*File*/int[]>list3=new ArrayList<>(20);
//        System.out.println(list3.get(0)[0]);

        HashSet<A>hs=new HashSet<>();
        hs.add(new A(10, "blue"));
        hs.add(new A(10,"blue"));
        System.out.println(hs);
        HashSet<Integer>hs2=new HashSet<>();
        hs2.add(2);
        hs2.add(2);
        System.out.println(hs2);
        HashMap<Integer,A> hashMap=new HashMap<>();
        hashMap.put(1,new A(20, "green"));
        A myA=hashMap.get(1);
        System.out.println(myA.size);
        System.out.println(myA.color);
    }
}
class A{
    int size;
    String color;
    public A(int size, String color){
        this.color=color;
        this.size=size;
    }
}
