package java_files;

import java.io.File;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args)throws Exception {
        File mine=new File("esra.txt");
        Scanner x= new Scanner(mine);
        while(x.hasNext()){
            System.out.println(x.nextLine());
        }
    }
}
