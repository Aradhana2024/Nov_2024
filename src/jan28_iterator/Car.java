package jan28_iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class Car {
    public static void main(String[] args) {

        // Make a collection
            ArrayList<String> cars = new ArrayList<>();
            cars.add("Honda");
            cars.add("BMW");
            cars.add("Toyota");
            cars.add("Ford");
            cars.add("Tesla");

            // Get the iterator
            ListIterator<String> it = cars.listIterator();

            // Loop through the list
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.println("---");

            // Loop backwards through the list
            while (it.hasPrevious()) {
                System.out.println(it.previous());
            }
        System.out.println("Cars of sublist index " +cars.subList(2,3)); //Getting Sublist Index of CAR
        System.out.println("last Index" +cars.get(3)); //Getting index of name 3
        System.out.println("Getting First" +cars.getFirst()); // Getting First Value of String
        System.out.println("Removing String from Index 2 "+cars.remove(2)); //Remove String

    }
    }

