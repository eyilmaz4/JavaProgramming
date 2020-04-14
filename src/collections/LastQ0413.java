package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class LastQ0413 {
    public static void main(String[] args) {
ArrayList<Integer>myList=new ArrayList<>(Arrays.asList(1,9,4,5));
       findMax(myList);
    }

    public static void findMax(ArrayList<Integer> arr) {

        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
             if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println(max);

        for (int i = 0; i <arr.size(); i++) {
            arr.set(i,max);
        }
        System.out.println(arr);
    }
}