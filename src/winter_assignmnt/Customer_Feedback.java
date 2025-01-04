package winter_assignmnt;

import java.util.Scanner;

public class Customer_Feedback {
    static Scanner get=new Scanner(System.in);
    static String yourName;
    static String studentNames = " ";
    static int answer = 1;

    public static void main(String[] args)
    {
        getNames();

        while(true)
        {
            if(answer == 1  )
            {
                System.out.println("Would you like to add another Customer Feedback  ? 1 for yes 2 for no ");
                answer=get.nextInt();
                System.out.println("Please enter the Customer Feedback ");
                yourName = get.nextLine();
                get.nextLine();

                break;
            }
        }
        Display();
    }

    public static String getNames()
    {
        System.out.println("Please enter Customer Feedback : ");
        yourName = get.nextLine();

        return yourName;
    }

    public static void Display()
    {
        System.out.println("Below are the Customer Feedback ");
        System.out.println(yourName);
    }
}