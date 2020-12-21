package IQ_Study;

import java.util.Scanner;

public class HR_DiagonalDifference {
    public static void main(String[] args) {
        System.out.println(diagonalDifference());
    }

    public static int diagonalDifference() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number of rows");
        int numberOfRows = scan.nextInt();
        int arr[][] = new int[numberOfRows][numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println("please enter for row:" + i);

            for (int j = 0; j < numberOfRows; j++) {
                System.out.println("please enter a number between -100 and +100 for row:"+i+"element:" + j);
                arr[i][j] = scan.nextInt();
                if (arr[i][j]<=-100 &&  arr[i][j]>=100){
                    break;
                }
            }
        }
        int sum1 = 0;
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            //for (int j = arr.length - 1; j > 0; j-=1) {
                sum1 += arr[i][j];
            }


        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              if(i==j){
                  sum2 += arr[i][j];
              }

                }
                    }
        System.out.println(sum1);
        System.out.println(sum2);
        int result=Math.abs(sum1-sum2);
        return result;
    }
}