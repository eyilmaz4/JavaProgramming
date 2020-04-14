package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class One2Thousand {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
            for(int i=0; i<=1000; i++){
                arr.add(i);

        }
            //showNums(arr);
    }
    public static void showNums(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
