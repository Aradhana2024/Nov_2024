package winter_assignmnt;
import java.util.HashMap; // Using Hashmap
import java.util.Scanner;

public class Grocery_Store_Price_Calculator
{
    public static void main(String[] args) {
        priceCalculator();
    }
    public static void priceCalculator(){
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 2.5);
        fruits.put("Banana", 1.5);
        fruits.put("Grapes", 3.5);
        fruits.put("Orange", 4.7);
        fruits.put("Mango", 6.8);
        for(String quantity : fruits.keySet())  {
            System.out.println(quantity);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fruit name:");
        String choice =  scanner.nextLine().trim();
        String formattedVersion = choice.toLowerCase();
        System.out.print("Please enter the amount in Kg :");
        int kg = scanner.nextInt();

        HashMap<String,Double> formattedFruits = new HashMap<>();
        for(String key : fruits.keySet()) {
            formattedFruits.put(key.toLowerCase(), fruits.get(key));
        }
        if(formattedFruits.containsKey(formattedVersion)) {
            System.out.println("Fruits: " + choice + " Price " + kg * formattedFruits.get(formattedVersion));
        }
    }
}
