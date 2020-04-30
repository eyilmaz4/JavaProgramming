//package collections;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class HackerRankPlatformQuestion {
//    public static void main(String[] args) {
//        Scanner x= new Scanner(System.in);
//        ArrayList<Integer>myList=new ArrayList<>();
//       int number=1;
//       while(number!=0){
//           System.out.println("enter number");
//           number=x.nextInt();
//           myList.add(number);
//           System.out.println(myList);
//       }
//        ArrayList<ArrayList<Integer>>dimList=new ArrayList<>();
//       for(int i=0; i<5; i++){
//          dimList.add(new ArrayList<Integer>());
//       }
//// hocanin cozumu
//
//
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> temp = new ArrayList<>();
//        int number1=1;
//        for(int i=0 ; i<5 ; i++){
//            arr.add(new ArrayList<>());
//            number1=1;
//            while(number1!=0){
//                System.out.print("Enter number");
//                number=scan.nextInt();
//                if(number1!=0){
//                    temp.add(number1);
//                    //System.out.println(temp);
//                }
//            }
//            arr.get(i).addAll(temp);
//            temp.clear();
//            //System.out.println(arr);
//        }
//
//        for(ArrayList<Integer> row : arr){
//            for (int num : row){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Please enter your query");
//
//String query=scan.next();
//String [] q=query.split(",");
//       int indexRow=Integer.parseInt(q[0])-1;
//       int indexCol=Integer.parseInt(q[1])-1;
//try{
//    System.out.println(arr.get(indexRow).get(indexCol));
//
//    }
//catch(){
//
//}
//
//
//       /*
//       ArrayList<ArrayList<Integer>>dimList=new ArrayList<>();
//       ArrayList<Integer>oneList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
//       dimList.get(0).addAll(oneList);
//        System.out.println(dimList);
//        oneList.clear();
//        oneList.addAll(Arrays.asList(7,9,4,3));
//        dimList.get(1).addAll(oneList);
//        System.out.println(dimList);
//*/
//
//
//
//
//
//
////       int index;
////        for(int i=0; i<myList.size();i++){
////            System.out.println("what is the index?:");
////            index=x.nextInt();
////            System.out.println("enter number");
////            number=x.nextInt();
////            myList.add(index,number);
////        }
////        int query;
////        int indexOFQuery;
////        for(int i=0; i<myList.size();i++){
////            System.out.println("enter your index to be find");
////            indexOFQuery=x.nextInt();
////            System.out.println("enter your number to be find");
////            query=x.nextInt();
////            if(myList.get(indexOFQuery))
////        }
//
//    }
//}
