package winter_assignmnt;

import java.util.Scanner;
import static java.lang.System.exit;
public class Grocery_Store {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String[] fruit=new String[6];
            double[] price=new double[6];
            System.out.println("Enter the fruits names");
            for(int i=0;i<fruit.length;i++){
                fruit[i]=sc.nextLine();
            }
            System.out.println("Please enter the price of the fruits per lb ");
            for(int i=0;i<price.length;i++){
                price[i]=sc.nextDouble();
            }
            System.out.println("Which Fruit you want to buy ");
            String name=sc.next();
            System.out.println("Please enter the weight in lb ");
            int w=sc.nextInt();
            double netprice;
            for(int i = 0; true; i++)
            {
                if(fruit[i].equals(name)) {
                    netprice = price[i] * w;
                    break;
                }
                else
                    System.out.println("Sorry, Not Available ");
                exit(0);
            }
            System.out.println("Total Amount is:  "+name+" is "+netprice);

        }
    }

