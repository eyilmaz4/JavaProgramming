package exceptions;
import java.util.Scanner;
public class Q2Answer {
    public static void main(String[] args) {
        giveMeValue();
    }
    public static void  giveMeValue(){
        String arr[][]={{"Java","OOP","Abstraction"},{"Encapsulation","Inheritance"},{"Interfaces"}};
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter index 1 : ");
        int index1=myScan.nextInt();
        System.out.print("Enter index 2 : ");
        int index2=myScan.nextInt();
        try{
            System.out.println(arr[index1][index2]);
            System.out.println("Item retrieved successfully");
        }
        catch (Exception e){
            System.out.println("Invalid index");
        }


    }

}
