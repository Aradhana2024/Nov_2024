package winter_assignmnt;
import java.util.Arrays;
import java.util.Scanner;

public class Library_Book_Management
     {
         String[] book = {"C", "C++", "JAVA", "RUBY", "PYTHON", "CYBER SECURITY"};
         public static void main(String[] args) {
             Library_Book_Management library = new Library_Book_Management();
             library.searchTitle();
             library.changeName();
             System.out.println(Arrays.toString(library.book));
         }
         public void searchTitle() {
             System.out.println("Welcome to Toronto library");
             System.out.println();
             System.out.println("Enter the name of the books for availability or not ");
             Scanner scanner = new Scanner(System.in);
             System.out.println();
             String input = scanner.nextLine().toUpperCase();
             for (int i = 0; i < 6; i++) {
                 if (book[i].contains(input)) {
                     System.out.println("Yes " + input + " Congrats ! Book is available...");
                     return;
                 }
             }
             System.out.println("Sorry ! This book is not available in library. ");
         }
         public void changeName() {
             int i;
             Scanner scanner = new Scanner(System.in);
             System.out.println();
             System.out.println("Enter the book title if you want to Change or Update...");
             String input = scanner.nextLine().toUpperCase();
             System.out.println("Enter New Book Name..");
             String newInput = scanner.nextLine().toUpperCase();
             for (i = 0; i < 6; i++) {
                 if (book[i].contains(input)) {
                     book[i] = newInput;
                 }
             }
         }
     }