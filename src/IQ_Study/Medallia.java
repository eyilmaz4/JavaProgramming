package IQ_Study;

import java.util.HashSet;

public class Medallia {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 6,5,10};
        //printFirstRepeating(arr);
        dub(arr);
    }
    public static void printFirstRepeating(int arr[]) {

        int min = -1;


        HashSet<Integer> set = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (set.contains(arr[i])){
                min = i;
               }
            else
                set.add(arr[i]);

        }
        // Print the result
        if (min != -1){
            System.out.println("The first repeating element is " + arr[min]);
           }
        else
            System.out.println("There are no repeating elements");
    }
//int arr[] = {4,2,3,4,2,1};
    public static int dub(int[] Arr) {
        int index=0;
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if ((Arr[i] == Arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + Arr[j]);
                    System.out.println("Index of that duplicate element : " + i);
                     index=i;
                }

            }
        }
        return index;
    }
}