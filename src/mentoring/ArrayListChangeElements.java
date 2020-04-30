package mentoring;

import java.util.ArrayList;
import java.util.Arrays;

//Change the place of the 2nd and 4th element of this ArrayList (P.C.: Element number is starting from 0. Which means that "Java" is 0th element of this array list)
public class ArrayListChangeElements {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Java","Cric","Play","Watch","Glass"));
       String temp=list.get(2);
       list.set(2,list.get(4));
       list.set(4,temp);
        System.out.println(list);

    }
}
