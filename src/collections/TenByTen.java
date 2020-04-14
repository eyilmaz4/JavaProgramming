package collections;

import java.util.ArrayList;

public class TenByTen {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myArrays = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myArrays.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                myArrays.get(i).add((int) (Math.random() * 100));
            }
        }
        for (ArrayList<Integer> row : myArrays) {
            for (int element : row) {
                System.out.println(element + "\t\t");
            }
        }
        multiply(myArrays,10);
    }
        public static void multiply(ArrayList<ArrayList<Integer>> arr,int number){
        for(ArrayList<Integer>numbers:arr){
            for(int elements:numbers){
                System.out.print(elements*number+"\t\t");
            }
            System.out.println();
        }
        }
//        public class TenByTenRandom {
//            public static void main(String[] args) {
//                ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//                for (int i = 0; i <10 ; i++) {
//                    arr.add(new ArrayList<>());
//                    for (int j = 0; j <10 ; j++) {
//                        arr.get(i).add((int)(Math.random()*100));
//                    }
//                }
//                for (ArrayList<Integer> row : arr){
//                    for(int element : row){
//                        System.out.print(element+"\t\t");
//                    }
//                    System.out.println();
//                }
//            }


    }