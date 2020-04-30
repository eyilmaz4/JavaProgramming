package collections;

import java.util.HashMap;

public class HashMapNumbers {
    public static void main(String[] args) {
        HashMap<Integer, Integer>myNums=new HashMap<>();
        myNums.put(1,1);
        myNums.put(2,3);
        myNums.put(3,2);
        myNums.put(4,1);
        myNums.put(5,5);

        System.out.println(myNums);
     int max=0;int index=0;
       for(int numbers:myNums.values()){
           if (numbers>max){
               max=numbers;
               index++;
                          }

        }
        System.out.println(max);
        System.out.println("index: "+index);
        }
    }

