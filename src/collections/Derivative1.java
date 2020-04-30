package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Derivative1 {
    public static void main(String[] args) {
        int [] arr={5,8,1,33,6,7,8};
        System.out.println(Arrays.toString(applyFirsDerivation(arr)));
    }
    public static int [] applyFirsDerivation(int[]arr){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            result.add(arr[i]-arr[i+1]);
        }
        int [] arr1=new int [arr.length-1];
        for(int i =0; i<arr.length-1; i++){
            arr1[i]=result.get(i);
        }
        return arr1;
    }
}
