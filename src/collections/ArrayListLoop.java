package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> myList= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10));
        myList.add(4);


myList.remove(6);
myList.add(6,99);
myList.set(5,12);//replace

        myList.add(10);
        myList.add(50);

        //Regular for loop
        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        //For each loop
        for(int element:myList){
            System.out.println(element);
        }
        // while loop
        int count=0;
        while(myList.size()>count){
            System.out.println(myList.get(count));
            count++;
        }
    }
}
