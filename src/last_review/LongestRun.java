package last_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestRun {
    public static void main(String[] args) {
int[] k={1,2,3,5,6,7,8};
        System.out.println(findLongestRun(k));

    }
//    public static void findLongestRun(int[]arr){
//        ArrayList<Integer>a=new ArrayList<>();
//        ArrayList<Integer>b=new ArrayList<>();
//        for(int i=0; i<arr.length-1; i++){
//while(Math.abs(arr[i]-arr[i+1])==1){
//
//    a.add(arr[i]);
//
//}
//
//    b.add(arr[i+1]);
//}
//
//        System.out.println("a"+a);
//        System.out.println("b"+b);
//        if(a.size()>b.size()){
//            System.out.println(a.size());
//        }
//        else{
//            System.out.println(b.size());
//        }
//    }
//}




    public static int findLongestRun(int []arr){
        List<Integer> maxRuns=new ArrayList<>();
        int current;
        int next;
        int count=1;
        for(int i=0; i<arr.length-1; i++){
            current=arr[i];
            next=arr[i+1];
            if(Math.abs(current-next)==1){
                count++;
            }
            else{
                maxRuns.add(count);
                count=1;
            }
        }
        maxRuns.add(count);
        return Collections.max(maxRuns);
    }
}
