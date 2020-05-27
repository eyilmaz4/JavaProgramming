package oca_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q9q6 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(5);
        System.out.println(list);
        System.out.println(Integer.max(list.get(0),1));
        String s="Whiz";
        String b=s.concat("lab");
        String c=s.toLowerCase();
        System.out.println(s+" "+b+" "+c);
    }
}
