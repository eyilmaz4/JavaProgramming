package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>L1=new ArrayList<>(Arrays.asList(1,-2,3));
        ArrayList<Integer>L2=new ArrayList<>(Arrays.asList(4,1,0));
        System.out.println(multiply(L1,L2));
    }
    public static ArrayList<Integer> multiply(ArrayList<Integer> list1, ArrayList<Integer>list2){
        ArrayList<Integer>multiple=new ArrayList<>();
        for(int i=0; i<list1.size(); i++){
            multiple.add(((list1.get(i))*(list2.get(i))));

        }
        return multiple;
    }
}
