package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer>newList=new ArrayList<>();
        int index=0;

        for(int i=myList.size()-1; i>=0; i--){
            newList.add(myList.get(i));

        }
       for(int element:newList){
           System.out.print(element+"\t");
       }


//       for(int i=myList.size()-1; i>=0;i--){
//           myList.set(index,myList.get(i));
//           index++;
//       }
//        System.out.println("my"+myList);

       int index1=myList.size()-1;
       int temp;
        for(int i=0; i<myList.size()/2; i++) {
            temp=myList.get(i);
            myList.set(i,myList.get(index1));
            myList.set(index1, temp);
            index1--;
        }
        System.out.println("second solution"+myList);
    }
}
