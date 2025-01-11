import java.util.Arrays;   // toString() method
public class HelloWorld {

        public static void main( String args[] ) {

            //Creating an integer array of length 4
            int[] numbers = {11, 12, 13, 14};
            // Calling the toString() method
            System.out.println(numbers.toString());
            // Calling the toString() method with arrays
            System.out.println(Arrays.toString(numbers));
        }
    }

//The third method uses the Arrays.toString() method to print the contents of the array as calling toString()
// only on an array returns a hash code value.
// Let’s see the following example to understand the behavior of toString() with and without using Array class.
//
//
//
//
//Ace Editor