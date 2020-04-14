package exceptions;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
findIndexOfArray(2,2);
    }
    public static void findIndexOfArray(int i, int j){
        Scanner x=new Scanner(System.in);
        int [][] arr=new int [i][j];
        System.out.println("enter index i");
        int a=x.nextInt();
        System.out.println("enter index j");
        int b=x.nextInt();
        try{
            System.out.println(arr[a][b]);
            System.out.println("successful");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enter indexes smaller than i:"+i+"and j"+j);
        }

    }

}
