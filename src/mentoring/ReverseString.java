package mentoring;
/* Reverse this array list:

ArrayList<String> list = {"Java","Cric","Play","Watch","Glass"};*/

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","Cric","Play","Watch","Glass"));
       System.out.println(list);

      int index=list.size()-1;
      String temp=" ";
      for(int i=0; i<list.size()/2; i++){
          temp=list.get(i);
            list.set(i, list.get(index));
            list.set(index,temp);
            index--;

        }
        System.out.println(list);
    }
}
