package HomeworkChallanges;

import java.util.Scanner;

public class FindMaxGiven3Integer {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter first number: ");
        int first=x.nextInt();
        System.out.println("enter second number: ");
        int second=x.nextInt();
        System.out.println("enter third number: ");
        int third=x.nextInt();
        int max=0;
        if(first>second){
            max=first;
            if(first>third){
                max=first;
            }
            else
            {
                max=third;
            }

        }
        else {
            max=second;
            if(second>third){
                max=second;
            }
            else{
                max=third;
            }
        }
        System.out.println("max number: "+max);
    }
}
