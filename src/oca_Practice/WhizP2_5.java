/*dljnvld*/
package oca_Practice;

import java.util.Arrays;
import java.util.Comparator;



public class WhizP2_5 {
    public static void main(String[] args) {
        String [] arr={"a","B","C","Z","k"};
        Arrays.sort(arr);
        for(String let:arr){
            System.out.println(let);
        }
        StringBuilder a= new StringBuilder("aBCZk");
        a.reverse();
        System.out.println(a);
        Comparator.reverseOrder();

        double i=Math.random();
        System.out.println(i);
    }
}
