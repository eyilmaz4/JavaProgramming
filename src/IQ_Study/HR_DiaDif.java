package IQ_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_DiaDif {
    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
       List<Integer>a=new ArrayList<>(Arrays.asList(10,20,30));
        List<Integer>b=new ArrayList<>(Arrays.asList(40,50,60));
        List<Integer>c=new ArrayList<>(Arrays.asList(90,80,90));
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(diagonalDifference(list));

    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeft=0;
        int sumRight=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    sumLeft += arr.get(i).get(j);
                }

            }

        }

        System.out.println(sumLeft);
        for (int i = 0, j=arr.size() - 1; i < arr.size(); i++,j--) {

                sumRight += arr.get(i).get(j);

            }

        System.out.println(sumRight);

        return Math.abs(sumLeft-sumRight);

    }

}
