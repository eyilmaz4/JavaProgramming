package IQ_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HR_miniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
//        for (int a : minMax(arr)
//        ) {
//            System.out.print(a + " ");
//        }
        minMaxSum(arr);
    }

    public static int[] minMax(int[] arr) {
        int min = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int a : arr
        ) {
            list.add(a);

        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            max += list.get(i);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            min += list.get(i);

        }

        return new int[]{min, max};
    }

    public static void minMaxSum(int[] arr) {
        int min = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int a : arr
        ) {
            list.add(a);

        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            max += list.get(i);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            min += list.get(i);

        }
        System.out.println(min+" "+max);
    }
}