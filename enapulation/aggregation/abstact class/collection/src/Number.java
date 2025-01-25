//Create an ArrayList to store numbers (add elements of type Integer)
import java.util.ArrayList;
public class Number {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(50);
        myNumbers.add(70);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}