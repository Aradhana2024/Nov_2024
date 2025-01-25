
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class
public class Addition_of_List{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        myNumbers.add(50);

        ArrayList<Integer> myNumber2 = new ArrayList<Integer>();
        myNumber2.add(100);
        myNumber2.add(200);
        myNumber2.add(300);
        myNumber2.add(400);
        myNumber2.add(500);
        myNumber2.add(600);


        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers)
        for (int j : myNumber2)
        {

            System.out.println(i);
            System.out.println(j);

        }
       // Collections.addAll()
        //arrNumbers.addAll(arrNumber2);

    }
}