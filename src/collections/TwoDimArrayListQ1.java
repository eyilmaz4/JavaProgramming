package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayListQ1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>myList=new ArrayList<>();
        ArrayList<Integer>myList1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>myList2=new ArrayList<>(Arrays.asList(6,7,8,9,10));
        myList.add(myList1);
        myList.add(myList2);
        System.out.println(myList);


}


    }
