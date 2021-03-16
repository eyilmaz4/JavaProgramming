package IQ_Study;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner x= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=x.nextInt();//5

        List<Integer>list=new LinkedList<>();

        for (int i = 0; i <size ; i++) {
            System.out.println("enter "+i+"th element");
            int temp= x.nextInt();//12 0 1 78 12
            list.add(i,temp);

        }

        System.out.println(list);
        System.out.println("Enter number of query");
        int action=x.nextInt();//2
        for (int i = 0; i <action ; i++) {
            System.out.println("Enter type of query number "+i);
            String val=x.next();//what type of action??
            if(val.equals("insert")){
                System.out.println("enter index to add");
                int index=x.nextInt();
                System.out.println("Enter value");
                int value=x.nextInt();
                list.add(index, value);
                System.out.println(list);
            }

            else if (val.equals("delete")){
                System.out.println("enter index to delete");
                int index1=x.nextInt();
                list.remove(index1);
                System.out.println(list);
            }

        }
        x.close();
        for(Integer a:list){
            System.out.print(a+" ");
        }


    }
}
//
//     Scanner x= new Scanner(System.in);
//         int size=x.nextInt();
//         LinkedList<Integer>list=new LinkedList<>();
//         for (int i = 0; i <size ; i++) {
//              int temp=x.nextInt();
//             list.add(i,temp);
//         }
//         int action=x.nextInt();
//         for (int i = 0; i <action ; i++) {
//             String val=x.next();
//             if(val.equals("insert")){
//                  int index=x.nextInt();
//                int value=x.nextInt();
// list.add(index, value);
//              }
//              else if (val.equals("delete")){
//                  int index1=x.nextInt();
//               list.remove(index1);
//             }
// }
//         x.close();
//        for(Integer a:list){
//            System.out.print(a+" ");
//       }
//         }

