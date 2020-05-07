package sortingAlgorithms;

import java.util.Comparator;

public class AuthorSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
    /*
    import java.util.Comparator;
​
public class AuthorSort implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getAuthor().compareTo(book2.getAuthor());
    }

     */
}
