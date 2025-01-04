package winter_assignmnt;

import java.util.Scanner;
public class Product_Inventory_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] product = {"Candy", "Cake", "Cup cakes", "Chocolate", "Ice-Cream"};
        Double[] price = {20.25, 120.50, 60.10, 80.0, 50.0};
        System.out.println("These are all the Christmas Gift product with there price ");
        for (int i = 0; i < product.length; i++) {

            System.out.println(product[i] + "   " + price[i]);

        }
        boolean isfound=false;
        System.out.println("Enter the Gift name ");
        String name = sc.nextLine();
        for (int i = 0; i < product.length; i++) {
            if (name.equals(product[i])) {
                isfound=true;
                System.out.println(product[i]+" "+price[i]);
                break;
            }
        }if(!isfound){
            System.out.println("It is not available");
        }

    }
}