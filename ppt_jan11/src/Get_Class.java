import java.util.*;  //  getClass() method


// The main class
    public class Get_Class {

        // The main function of our program
        public static void main(String[] args) {

            // Instantiating Object class
            Object obj = new Object();

            System.out.println("Class of obj is : " + obj.getClass()); // printing class name

            // Instantiating String class
            String str = new String();

            System.out.println("Class of str : " + str.getClass()); // printing class name

            // Instatntiating ArrayList class
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Class of arr : " + arr.getClass()); // printing class name
        }
    }
