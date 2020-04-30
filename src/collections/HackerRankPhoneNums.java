package collections;
import java.util.Scanner;
import java.util.HashMap;

public class HackerRankPhoneNums {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("how many entries ?");
        int n=x.nextInt();
        HashMap<String, Integer>pb=new HashMap<>();
        String name;
        int phoneNumber;
        for(int i=0; i<n; i++){
            System.out.print("Please enter name");
            name=x.next();
            System.out.println();
            System.out.print("Please enter phone number");
            phoneNumber=x.nextInt();

            pb.put(name, phoneNumber);
        }
        System.out.println(pb);
        //query starts
     int numberOfQuestions=3;
     String query;
        while (numberOfQuestions>=0){
            System.out.println("enter");
            query=x.next();
            if(pb.containsKey(query)){
                System.out.println(query+"="+pb.get(query));
            }
            else
            {
                System.out.println("not found");
            }
            numberOfQuestions--;

        }

    }



}
