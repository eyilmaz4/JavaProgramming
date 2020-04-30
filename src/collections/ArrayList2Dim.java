package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2Dim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>TwoDim=new ArrayList<>();
        ArrayList<Integer>one=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>two=new ArrayList<>(Arrays.asList(6,7,8,9,10));

        TwoDim.add(0,one);
        TwoDim.add(1,two);
        System.out.println(TwoDim);
        /*
             ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        int number=1;
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                list.get(i).add(number);
                number++;
            }
        }
        System.out.println(list);
        for(ArrayList<Integer> sublist : list){
            for (int numb : sublist){
                System.out.println(numb);
            }
        }
        Iterator<ArrayList<Integer>> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
​
​
​

         */
    }
}
