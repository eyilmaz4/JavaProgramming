package java_files;

import java.io.File;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args)throws Exception {//or try catch
        File myFile=new File("esra.txt");
        Scanner x= new Scanner(myFile);
        while (x.hasNext()){
            System.out.print(x.nextLine());
        }
    }
    /*
    public class FileReading {
    public static void main(String[] args)  {
        try {
            File myFile = new File("first.txt");
            Scanner scanner = new Scanner(myFile);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (Exception e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }

     */
}
