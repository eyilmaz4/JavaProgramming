package sortingAlgorithms;

import java.util.Comparator;

public class PageSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2){
        if(b1.getPage()==b2.getPage()){
            return 0;
        }
        else if( b1.getPage()>b2.getPage()){
            return 1;
        }
        else {
            return -1;
        }
        /*
        public class PagesSorting implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        if(book1.getPages()==book2.getPages()){
            return 0;
        }
        else if(book1.getPages()>book2.getPages()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
Collapse


















Message #classchat


         */
    }
}
