package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationArrays {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,-7));
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(5,2,3,-7));
        ArrayList<Integer>Multiply=new ArrayList<>();
        for(int i=0; i<list1.size(); i++){
            Multiply.add((list1.get(i))*(list2.get(i)));
        }
        System.out.println(Multiply);

    }
}
