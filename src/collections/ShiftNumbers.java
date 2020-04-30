package collections;

import java.util.Arrays;

public class ShiftNumbers {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        shiftPerNeed(arr,2);
        shiftPerNeed(arr,1);
    }
    public static void shiftPerNeed(int [] arr, int num){
      int [] arrN=new int[arr.length-num];
      int index=0;
      for(int i=num; i<arr.length; i++){
            arrN[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(arrN));
    }
}
