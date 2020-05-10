package Project2;

import java.io.FileWriter;
import java.util.Scanner;

public class InventoryOperations {
    public static void insertItems(String path)throws Exception {
        FileWriter writer=new FileWriter(path);
        Scanner scan=new Scanner(System.in);
        String item="";
       String answer;
        while(true){
            item="";
            System.out.print("Product ID: ");
            item+=scan.nextLine();
            System.out.print("Product Name: ");
            item+=scan.nextLine()+"\t\t";
            System.out.print("Product Price: ");
            item+=scan.nextLine()+"\t\t";
            System.out.println("Quantity : ");
            item+=scan.nextLine()+"\n";
            System.out.println("Continue ? (Y/N");
            answer=scan.next();
            writer.write(item);
            if(answer.equals("q")){
                break;
            }
        }
        writer.close();
        /*
        public class InventoryOperations {
​
    public static void insertItems(String path) throws Exception{
        FileWriter writer = new FileWriter(path);
        Scanner scan = new Scanner(System.in);
        String item;
        String answer;
        while (true){
            item = "";
            System.out.print("Product id: ");
            item += scan.nextLine()+"\t\t";
            System.out.print("Product name: ");
            item += scan.nextLine()+"\t\t";
            System.out.print("Product price: ");
            item += scan.nextLine()+"\t\t";
            System.out.print("Quantity: ");
            item += scan.nextLine()+"\n";
            System.out.print("Continue?(Y/N)");
            answer = scan.nextLine();
            writer.append(item);
            if(answer.equalsIgnoreCase("y")){
                break;
            }
        }
        writer.close();
    }
    public static void listInventory(String path) throws Exception{
        File file = new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
    public static void listInventory(String path,String product){
​
    }
    public static void listInventory(String path,int quantity){
​
    }

         */
    }
}
