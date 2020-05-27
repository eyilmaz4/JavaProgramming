package oca_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q9q5 {
    public static void main(String[] args) {
        List<String>strings=new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        System.out.println(strings);
String [] arr=new String [2];
       // String arr[]={"E","F","G", "H", "I"};
        arr=strings.toArray(arr);
        System.out.println(arr);
        for(String s:strings){
            System.out.println(s);
        }
    }
}
