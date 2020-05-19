package oca_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q6q1 {
    public static void main(String[] args) {
        List<String> ints=new ArrayList<>();
        ints.add("a");
        ints.add("b");
        ints.add("c");
        while(!ints.isEmpty()){
            System.out.println(ints.remove(0));
            System.out.println(ints);
        }
        for(int i=10; i>5; i++){
            if(i==16) i-=11;
            System.out.println(i);
        }
    }
}
