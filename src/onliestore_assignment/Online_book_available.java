package onliestore_assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Online_book_available {
    public static void main(String[] args) {
        ArrayList<Double> price= new ArrayList<>();
        price.add(50.0);
        price.add(40.0);
        price.add(55.0);
        ArrayList<Integer>quantity = new ArrayList<>();
        quantity.add(10);
        quantity.add(5);
        quantity.add(8);

//Calculates the total inventory value by multiplying the price of each book by the quantity available.
    for (int i=0; i< price.size();i++)
    for (int j=0; j< quantity.size();j++)
        System.out.println("Inventory Value of the Book each book is: " +price.get(i)* quantity.get(j));

//Use a HashSet to store the unique authors in the bookstore (i.e., no duplicate authors).
        LinkedHashSet<String> author = new LinkedHashSet<>();
        author.add("James Gosling");
        author.add("James Gosling"); // Adding some duplicate values.
        author.add("Joshua Bloch");
        author.add("Joshua Bloch");
        author.add("Robert C. Martin");
        author.add("Robert C. Martin");
        System.out.println("unique authors in the bookstore" +author); //no duplicate authors allow in output.

        //Use a TreeSet to store the books ordered by their title (lexicographically).
        TreeSet<String> title = new TreeSet<>();
        title.add("Book ID: B102, Title: Clean Code, Author: Robert C. Martin, Price: 40.0, Quantity: 5");
        title.add("Book ID: B101, Title: Java Programming, Author: James Gosling, Price: 50.0, Quantity: 10");
        title.add("Book ID: B103, Title: Effective Java, Author: Joshua Bloch, Price: 55.0, Quantity: 8");
        System.out.println("Books Sorted by Title" +title); // ordered by their title


    }
}
