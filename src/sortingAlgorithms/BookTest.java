package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
       List<Book> books=new ArrayList<>(10);
       books.add(new Book("Java","Duran",130));
       books.add(new Book("SQL","James", 500));
       books.add(new Book("Ants","Kaplan", 400));

        Collections.sort(books,new TitleSorting());
        for(Book book:books){
            System.out.println(book.getTitle()+"\t"+book.getAuthor()+"\t"+book.getPage());
        }
        System.out.println("--------------------------");
        Collections.sort(books,new AuthorSorting());
        Iterator<Book> iter=books.iterator();
        Book temp;
        while(iter.hasNext()){
            temp=iter.next();
            System.out.println(temp.getTitle()+temp.getAuthor()+temp.getPage());
        }
        System.out.println("------------------");
        Collections.sort(books,new PageSorting());
        for(Book book:books){
            System.out.println(book.getTitle()+book.getAuthor()+book.getPage());
        }

    }
    /*
    package sorting;
​
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
​
public class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(10);
        books.add(new Book("Tom Sawyer","Mark Twain",410));
        books.add(new Book("Cracking Coding Interview","Kelly",640));
        books.add(new Book("Java and Data Structures","William",530));
​
        Collections.sort(books,new TitleSorting());
        for(Book book : books){
            System.out.println(book.getTitle()+"\t"+book.getAuthor()+"\t"+book.getPages());
        }
        System.out.println("------------------------------------------");
​
        Collections.sort(books,new AuthorSort());
        Iterator<Book> iter = books.iterator();
        Book temp;
        while(iter.hasNext()){
            temp = iter.next();
            System.out.println(temp.getTitle()+"\t"+temp.getAuthor()+"\t"+temp.getPages());
        }
​
        System.out.println("---------------------------------------------");
​
        Collections.sort(books, new PagesSorting());
        for(Book book : books){
            System.out.println(book.getTitle()+"\t"+book.getAuthor()+"\t"+book.getPages());
        }
    }
}
Collapse















     */
}
