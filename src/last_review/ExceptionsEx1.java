package last_review;

import java.io.File;

public class ExceptionsEx1 {
    public static void main(String[] args) throws Exception {
        File file = new File("abc.txt");
        file.createNewFile();//checked exception
        "abc".charAt(5);//unchecked exception

        double arr[][] = new double[9999999][99999999];//heap space out of memory
    }
}