package mentoring;

import java.util.ArrayList;
import java.util.Arrays;

//5. Print sum of the all NEGATIVE numbers in the array list:
//ArrayList<Integer> list = {-2, 34, -11, 9, -6, 3};
public class ArrayListNegativeSum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(-2, 34, -11, 9, -6, 3));
        int sum=0;
        for(int i=0; i<list.size();i++){
            if(list.get(i)<0){
                sum+=list.get(i);

            }
        }
        System.out.println(sum);
    }
}
