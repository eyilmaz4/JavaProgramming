package mentoring;

public class BooleanAscending {
    public static void main(String[] args) {
        int []arr={1,2,3,4,3};
        System.out.println(isSorted(arr));
        int []arr1={1,2,3,3,4};
        System.out.println(isSorted(arr1));
    }
    public static boolean isSorted(int [] arr){
        boolean result=false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                result=true;
            }
            else {
                result= false;
            }
        }
        return result;
    }
}
