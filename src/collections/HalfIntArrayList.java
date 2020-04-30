package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class HalfIntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>newA=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        cutHalf(newA);
    }
    public static void cutHalf(ArrayList<Integer>arr){
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0; i<arr.size()/2; i++){
            list1.add(arr.get(i));
        }
        for(int i=arr.size()/2; i<arr.size(); i++){
            list2.add(arr.get(i));
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
