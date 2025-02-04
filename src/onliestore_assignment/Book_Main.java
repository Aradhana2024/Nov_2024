package onliestore_assignment;

import java.util.ArrayList;
import java.util.List;

public class Book_Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("B101","Java Programming","James Gosling",50.0,10));
        books.add(new Book("B102","Clean Code","Robert C Martin",40.0,5));
        books.add(new Book("B103","Effective Java","Joshua Bloch",55.0,8));

        System.out.println(books);

    }
}
