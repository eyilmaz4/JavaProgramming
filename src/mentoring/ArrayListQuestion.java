package mentoring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuestion {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(4);
    a.add(15);
    a.add(1);
    a.add(89);
    a.add(24);

    ArrayList<Integer> b=new ArrayList<Integer>();

        int tmp=0;


        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j <a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }

        }
        for(int element:a){
            System.out.println(element);
        }
    }
}
