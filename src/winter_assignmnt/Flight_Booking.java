package winter_assignmnt;

import java.util.Arrays;
import java.util.Scanner;

public class Flight_Booking {

        String[] destination = {"Paris", "Toronto", "India", "Porto", "Florida", "London"};
    public static void main(String[] args)
    {
        Flight_Booking flights = new Flight_Booking();
        flights.searchDestination();
        flights.changeDestination();
        System.out.println(Arrays.toString(flights.destination));
    }
        public void searchDestination() {
            System.out.println("Enter your Arrival Place is : ");
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            String input = scanner.nextLine();
            for (int i = 0; i < 6; i++) {
                if (destination[i].equalsIgnoreCase(input)) {
                    System.out.println("Yes " + input + "Ticket are available for your destination place  ");
                    return;
                }
            }
            System.out.println("Sorry ! Not available. Please find other destination ");
        }
        public void changeDestination() {
            System.out.println("Enter the change or alternate destination place please ");
            int i;
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            String input = scanner.nextLine();
            System.out.println("Congrats ! Your new destination place is  : ");
            String newInput = scanner.nextLine();
            for (i = 0; i < 6; i++) {
                if (destination[i].equalsIgnoreCase(input)) {
                    destination[i] = newInput;
                }
            }
        }
    }

