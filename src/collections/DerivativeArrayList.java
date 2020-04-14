package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DerivativeArrayList {
    public static void main(String[] args) {
   /* ArrayList<Integer>newList=new ArrayList<>(Arrays.asList(3,5,4,0,7,9,12));
    findDerivative(newList);*/


        int[] pixels = {23, 53, 31, 32, 55};
        System.out.println(findFirstDerivative(pixels));
        ArrayList<Integer> pixels2 = new ArrayList<>(Arrays.asList(1, 45, 23, 8, 2, 4, 72, 10, 78, 100));
        System.out.println(findFirstDerivative(pixels2));
    }

    public static void findDerivative(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {//{1,2,3,4,5
            newList.add(Math.abs(list.get(i - 1) - list.get(i)));


            System.out.println(newList);

        }
    }

    public static ArrayList<Integer> findFirstDerivative(int[] arr) throws ArrayIndexOutOfBoundsException {
        ArrayList<Integer> derivation = new ArrayList<>();
        try {
            for (int i = 0; i < arr.length; i++) { //arr={1,2,3,4,5}
                //arr2={1,1,1,
                derivation.add(arr[i] - arr[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        } finally {
            return derivation;
        }

    }

    public static ArrayList<Integer> findFirstDerivative(ArrayList<Integer> arr) throws ArrayIndexOutOfBoundsException {
        ArrayList<Integer> result = new ArrayList<>();
        try {
            for (int i = 0; i < arr.size() - 1; i++) {
                result.add(arr.get(i) - arr.get(i + 1));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            return result;

        }
    }
}
