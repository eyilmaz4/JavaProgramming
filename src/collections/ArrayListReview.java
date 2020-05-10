package collections;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<String>myArr=new ArrayList<>();
        System.out.println(myArr);
        String[]arr=new String[0];
        //System.out.println(arr[0]);you can not do anything emty array
   String [] arr2={"a", "b","v"};
   arr=arr2;
        System.out.println(arr[0]);
        myArr.add("java");
        myArr.add("is");
        myArr.add("fun");
        System.out.println(myArr);
myArr.remove("java");
        System.out.println(myArr);
        myArr.set(0,"java");
        System.out.println(myArr);




    }
}
