package IQ_Study;

public class HR_BigSum {
    public static void main(String[] args) {
long []arr={1000000001,1000000002, 1000000003, 1000000004,1000000005};

        System.out.println(bigSum(arr));
    }
    public static double bigSum(long[]arr){
      long result=0;

        if(arr.length<=10 && arr.length>=0){
            for(int i=0; i<arr.length; i++){
             if(arr[i]>=0 && arr[i]<=Math.pow(10,10)){
                    result=result+arr[i];
                }
            }
        }
return result;
    }
}
