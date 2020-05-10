package java_files;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DeleteDuplicates {
    public static void main(String[] args)throws Exception {
delete("src\\java_files\\ab.txt");
    }
    public static void delete( String path)throws Exception{
        File mine=new File(path);
        HashSet<String>hs=new HashSet<>();
        String duplicatesRemoved="";
        Scanner x= new Scanner(mine);
        while(x.hasNext()){
            hs.add(x.nextLine());
                }
        x.close();
        mine.delete();

        duplicatesRemoved=hs.toString();
        FileWriter writer=new FileWriter(path);
            writer.write(duplicatesRemoved);
            writer.close();
            /*
            public class DeletingDuplicates {
    public static void main(String[] args) throws Exception {
        removeDuplicates("src\\java_files\\example.txt");
    }
    public static void removeDuplicates(String path) throws Exception{
        File file = new File(path);
        String duplicatesRemoved="";
        Scanner scanner = new Scanner(file);
        HashSet<String> hashSet = new HashSet<>();
​
        while(scanner.hasNext()){
            hashSet.add(scanner.nextLine());
        }
        file.delete();
        scanner.close();
        duplicatesRemoved = hashSet.toString();
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(duplicatesRemoved);
        fileWriter.close();
    }
}


             */
        }
}
