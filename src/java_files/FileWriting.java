package java_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("esra.txt");
            myFile.write("Java is fun");
            myFile.write("files can be tricky");
            myFile.write("but it is still fun");
            myFile.close();


        } catch (IOException e) {
            System.out.println("oops");

        }
        /*
        public class FileWriting {
    public static void main(String[] args)  {
        try {
            FileWriter myWriter = new FileWriter("first.txt");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.close();
        }
        catch (IOException e){
            System.out.println("Oops");
            e.printStackTrace();
        }
    }

         */
    }
}
