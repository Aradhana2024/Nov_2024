package onliestore_assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Bookstore {
    public static void main(String[] args) {
        ArrayList<String> bookId = new ArrayList<>(); // collection of books using an ArrayList for storing
        bookId.add("Java Programming");
        bookId.add(" Clean Code");
        bookId.add("Effective Java");

        Map<String, Integer> set = new HashMap<>(); //Store all the BookId and Quantity
        set.put("B101", 10);
        set.put("B102", 5);
        set.put("B103", 8);

        ArrayList<Double>price= new ArrayList<>();
        price.add(50.0);
        price.add(40.0);
        price.add(55.0);

        // Adding new "BOOK book" to the bookstore"
        System.out.println("Adds a book to the bookstore" + bookId.add("BOOK book"));
        // Remove the BOOK book book from the list
        System.out.println("Removes a book from the bookstore." + bookId.removeLast());
        //Displays all books available in the bookstore
        System.out.println("Displays all books available in the bookstore " + bookId);
        System.out.println("BookID & Number of books Available" + set);


        // If no book is found, throw an exception.
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(5);
        set1.add(8);

        { try {
            System.out.println("Number of Books available " +set1.add(0));
            set1.add(0);
        } catch (Exception e) {
            System.out.println("Books not available");
            throw new RuntimeException(e);

        }



        }
    }




}