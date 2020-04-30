package mentoring;

import java.util.ArrayList;
import java.util.Arrays;

//4. Print only EVEN elements of this array list:
//ArrayList<Integer> list = {1, 25, 8, 45, 66, 2, 0, 98, 114, 1221, 899992};
public class EvenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 25, 8, 45, 66, 2, 0, 98, 114, 1221, 899992));
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0; i<list.size();i++){
            if(list.get(i)%2==0){
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }
}
