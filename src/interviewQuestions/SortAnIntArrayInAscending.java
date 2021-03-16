package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnIntArrayInAscending {

    //9. Write a return method that can sort an int array in Ascending
    //order without using the sort method of the Arrays class

    public static void main(String[] args) {
        int[] num ={4,8,3,2,6,};
        System.out.println("Result :"+ Arrays.toString(Sort(num)));
    }

    public static int[] Sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }
}
