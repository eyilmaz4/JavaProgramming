package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        System.out.println(convert(array));
    }
    public static ArrayList<Integer> convert(int [] arr){
       ArrayList<Integer>list=new ArrayList<>();
           for(int i=0; i<arr.length; i++){
               list.add(arr[i]);
        }
           return list;
    }
}
