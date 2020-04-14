package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimAList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> firstTwoDim = new ArrayList<>(3);
        System.out.println(firstTwoDim);
        firstTwoDim.add(new ArrayList<>());
        firstTwoDim.add(new ArrayList<>());
        firstTwoDim.add(new ArrayList<>());
        System.out.println(firstTwoDim);

        firstTwoDim.get(0).add(10);
        System.out.println(firstTwoDim);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                firstTwoDim.get(i).add((int) Math.pow(j, 2));
            }
        }
        System.out.println(firstTwoDim);

        ArrayList<Integer>toInsert=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(firstTwoDim);
        firstTwoDim.add(toInsert);
        System.out.println(firstTwoDim);

//        public class TwoDimFirstOuestion {
//            public static void main(String[] args) {
//                ArrayList<ArrayList<Integer>> myTwo = new ArrayList<>();
//                int number=1;
//                for(int i=0 ; i < 2 ; i++){
//                    myTwo.add(new ArrayList<>());
//                    for (int j=0 ; j<5 ; j++){
//                        myTwo.get(i).add(number);
//                        number++;
//                    }
//                }
//                //System.out.println(myTwo);
//                for (int i=0 ; i<myTwo.size() ; i++){
//                    System.out.println(myTwo.get(i));
//                }
//                for(ArrayList<Integer> arr : myTwo){
//                    for(int numbers : arr){
//                        System.out.println(numbers);
//                    }
//                }
//                //while loop implementation
//                int index=0;
//                while(index<myTwo.size()){
//                    System.out.println(myTwo.get(index));
//                    index++;
//                }
//                //Nested while loop implementation
//                int indexOuter=0;
//                int indexInner;
//                while(indexOuter<myTwo.size()){
//                    indexInner=0;
//                    while(indexInner<myTwo.get(indexOuter).size()){
//                        System.out.println(myTwo.get(indexOuter).get(indexInner));
//                        indexInner++;
//                    }
//                    indexOuter++;
//                }
//            }


        }
}