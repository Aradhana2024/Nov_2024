package winter_assignmnt;

import java.util.HashMap;
import java.util.Scanner;

public class Commerce {
    public static void main(String[] args) {
        saleAnalysis();
    }
    public static void  saleAnalysis(){
        HashMap<String, Double> products = new HashMap<>();
        products.put("Colour", 20.31);
        products.put("Paint", 7.21);
        products.put("Brush", 5.29);
        products.put("Pencil", 20.99);
        products.put("Eraser", 5.99);
        products.put("Book", 35.29);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Product you want to buy :");
        String choice =  scanner.nextLine().trim();
        String formatText =  choice.toLowerCase();

        HashMap<String, Double> formattedVersion = new HashMap<>();
        for(String key : products.keySet()){
            formattedVersion.put(key.toLowerCase(), products.get(key));
        } if(formattedVersion.containsKey(formatText)) {
            System.out.println(" product is : " + choice + "\nPrice " + " $" + formattedVersion.get(formatText));
        }
    }
}