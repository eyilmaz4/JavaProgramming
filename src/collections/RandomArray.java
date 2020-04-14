package collections;

import java.util.ArrayList;
import java.util.Collections;

public class RandomArray {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer>();
        for(int i=0; i<=100; i++){
            myList.add((int)(Math.random()*1000));
        }
        for(int elements:myList){
            System.out.print(elements+"\t");
        }
        System.out.println();
        int max=0;
        for(int i=0; i<myList.size(); i++){
            if(myList.get(i)>max){
                max=myList.get(i);
           }
        }
        System.out.println("max number:"+max);
        int min=myList.get(0);
        for(int i=0; i<myList.size(); i++){
            if(myList.get(i)<=min){
                min=myList.get(i);
            }
        }
        System.out.println("min:"+min);

        Collections.sort(myList);// to sort the Array list
        System.out.println("minumum:"+myList.get(0));
        System.out.println("max:"+myList.get(myList.size()-1));
        for(int elements:myList){
            System.out.print(elements+"\t");
        }
        System.out.println();
        int medyan=myList.get(myList.size()/2);
        System.out.println("medyan:"+medyan);

        System.out.println("Smallest 3 elments:");
        for(int i=0; i<3;i++ ){
            System.out.print(myList.get(i)+"\t");
        }
        System.out.println();
        System.out.println("Largest 3 elements:");
        for(int i=myList.size()-1; i>(myList.size()-4);i-- ){
            System.out.print(myList.get(i)+"\t");
        }

    }



}
