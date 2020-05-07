package sortingAlgorithms;

import java.util.Comparator;

public class TitleSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }
    /*
    package sorting;
​
import java.util.Comparator;
​
public class TitleSorting implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }

     */
}
