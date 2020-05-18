package bookShelfProject;

import java.util.ArrayList;
import java.util.Arrays;

public class BookShelf {
    public static void main(String[] args) {
        Menu bs=new Menu("Book Shelf",new ArrayList<>(Arrays.asList("List All Books", "List lost Books")));
  bs.displayMenu();
    }
}
