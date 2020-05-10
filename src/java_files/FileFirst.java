package java_files;

import java.io.File;
import java.io.IOException;

public class FileFirst {
    public static void main(String[] args) {
        try{
            File myFile=new File("esra.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: "+myFile);
            }
            else {
                System.out.println("File already exist");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    /*
    public class FileFirst {
    public static void main(String[] args) {
            try {
                File myFile = new File("first.txt");
                if (myFile.createNewFile()) {
                    System.out.println("File created "+myFile);
                }
                else {
                    System.out.println("File already exist");
                }
            }
            catch (IOException e){
                System.out.println(e);
            }
​
​
    }

     */
}
