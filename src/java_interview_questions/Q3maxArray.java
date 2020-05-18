package java_interview_questions;

public class Q3maxArray {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,7};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[]arr){
        int max=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
