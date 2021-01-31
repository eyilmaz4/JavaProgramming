package interview;

import java.util.ArrayList;
import java.util.List;

public class ZeroLast {
    public static void main(String[] args) {
        int [] arr={5,6,0,7};
        String ak=" ";
        for (int i:pushZeroToEnd(arr,4)
             ) {

               ak+=i+" ";
            }
        System.out.println(ak);


    }
        public static int[] pushZeroToEnd(int[] arr, int n){
            List<Integer> list = new ArrayList();
            for (int i = 0; i < n; i++)
                if (arr[i] != 0)
                    list.add(arr[i]);
            for (int i = list.size(); i < arr.length; i++) {
                list.add(0);
            }
            return list.stream().mapToInt(i -> i).toArray();
        }

}
