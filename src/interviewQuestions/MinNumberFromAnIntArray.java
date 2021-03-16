package interviewQuestions;

public class MinNumberFromAnIntArray {

    //8. Write a method that can find the maximum number from an int
    //Array

    public static void main(String[] args) {

        int[] num={4,3,6,3,2};
        System.out.println("Result :"+maxValue(num));
    }

    public static int maxValue( int[] n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n){
            if(each < min){
                min = each;
            }
        }
        return min;
    }


}
