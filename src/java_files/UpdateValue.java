package java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import abstraction.AnimalTest;

public class UpdateValue {
    public static void main(String[] args) throws Exception {
        updateNew("Apple", "orange", "src\\java_files\\sampleFruits.txt");
    }

    public static void updateNew(String old, String update, String path) throws IOException {
        File file = new File(path);
        String content = "";
        String line;
        Scanner x = new Scanner(file);
        while (x.hasNext()) {
            line = x.nextLine().strip();
            if (line.equals(old)) {
                content += update + "\n";
            } else {
                content += line + "\n";
            }
            content.replaceAll(old, update);
            file.delete();
            x.close();
            FileWriter writer = new FileWriter(path);
            writer.write(content);
            writer.close();
        }
    }
}

