package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeBinary {
    public static void main(String[] args) {
        int arr[]={1,2,7};
        returnBinary(arr);
    }
    public static void returnBinary(int[] arr){
        LinkedList<Integer>list=new LinkedList<Integer>();
        for(int nums:arr){
            list.add(nums);
        }
        System.out.println(list);
        LinkedList<Integer>list2=new LinkedList<>();
        for(int i=list.size()-1; i>=0; i--){
            list2.add(((int)Math.pow(2,i)));
        }
        System.out.println(list2);
        int  result;
        int finalR=0;
        for(int i=0; i<list.size(); i++){
           result=list.get(i)*list2.get(i);
           finalR+=result;
            }

        System.out.println(finalR);
    }


}
