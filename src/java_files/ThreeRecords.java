package java_files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ThreeRecords {
    public static void main(String[] args) throws Exception {
        File myFile = new File("data.txt");
        FileWriter myWriter = new FileWriter("data.txt");
        myWriter.write("Chips\t $2.99\n");
        myWriter.write("Apple\t $1.49\n");
        myWriter.write("Candy\t $2.99\n");
        myWriter.close();

        File y = new File("data.txt");
        Scanner x = new Scanner(y);
        while (x.hasNext()) {
            System.out.println(x.nextLine());
        }
        x.close();
        Scanner k=new Scanner(y);
        String key;
        while (k.hasNext()) {
            key=k.nextLine();
            if(key.charAt(0)=='A'){
                System.out.println(key);
            }
        }
        k.close();

        Scanner p=new Scanner(y);
        String chars;
        int sum=0;
        while (p.hasNext()){
           chars=p.nextLine();
          sum+= chars.length();

        }
        System.out.println(sum);
        p.close();

        Scanner t=new Scanner(y);
        int numOfProducts=0;
        while (t.hasNext()){
           if(t.nextLine()!=""){//if yerine hocanin codu: t.nextLine(); // nextline yerine next yazarsak toplam kelime sayisini buluruz 6
               numOfProducts++;
           }
        }
        System.out.println(numOfProducts);
        t.close();
    }
}
