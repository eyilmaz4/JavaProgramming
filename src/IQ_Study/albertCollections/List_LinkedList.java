package IQ_Study.albertCollections;

import java.util.*;

public class List_LinkedList {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>(Arrays.asList(1,2,3,5,64,2,1));
        System.out.println(list);
        ArrayList<String>list1=new ArrayList<>(Arrays.asList("Ali","Serkan","Bora","Cemal","Sirin","Zeynep","Guzide"));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }

}
