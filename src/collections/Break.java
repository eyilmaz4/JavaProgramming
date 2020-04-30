package collections;
import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            System.out.println(i);
            if(i==6){
                System.out.println("it is 6");
                break;

            }
        }
Scanner x=new Scanner(System.in);
        while(true){
            System.out.println("enter number");
            int number=x.nextInt();
            if(number==0){
                break;
            }
        }
        }
    }

