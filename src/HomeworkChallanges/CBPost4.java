package HomeworkChallanges;

import java.util.Arrays;

public class CBPost4 {
    public static void main(String[] args) {
        int [] arr={1,2,4,3,1,4,2,3,6,7,6,5,8};
        System.out.println(Arrays.toString(post4(arr)));
    }
    public static int[] post4(int[] nums) {
        int i=0;
        while(nums[i]!=4){
            i++;
        }
        int len=nums.length-(i+1);
        int[]arr=new int[len];
        int index=i+1;
        for(int j=0; j<arr.length;j++){
            arr[j]=nums[index];
            index++;
        }
        return arr;
    }

}
