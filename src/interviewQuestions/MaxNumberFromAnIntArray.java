package interviewQuestions;

import java.util.Arrays;

public class MaxNumberFromAnIntArray {

    //7. Write a method that can find the maximum number from an int
    //Array


    public static void main(String[] args) {

        int[] num = {3,7,1,2,4};
        System.out.println("Result :"+ maxValue(num));
    }

    public static int maxValue( int[] n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


}
