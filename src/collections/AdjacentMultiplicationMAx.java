package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AdjacentMultiplicationMAx {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
       int [] arr={1,2,3,5,2,4};
       findAdj(arr);
    }
    public static void findAdj(int[]arr){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0 ;i<arr.length-1;i++){
            list.add(arr[i]*arr[i+1]);
        }
        System.out.println(list);
        int max= Collections.max(list);
        System.out.println("max:"+max);
        int index=list.indexOf(max);
        System.out.println("index:"+index);
        System.out.println(index);
        System.out.println("index 1:\t"+index+"\t value:\t"+arr[index]);
        System.out.println("index 2:\t"+(index+1)+"\tvalue:\t"+arr[index+1]);
        System.out.println("Max multiplication:\t"+(arr[index]*arr[index+1]));

    }
}
