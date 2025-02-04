//The HashMap class has many useful methods. For example, to add items to it, use the put() method:
package jan31aradhana;
import java.util.HashMap;
public class HashPrograms {
    public static void main(String[] args) {
        HashMap<String, String> capital = new HashMap<>();

        capital.put("India", "New Delhi");
        capital.put("Canada", "Ottawa");
        capital.put("England", "London");
        capital.put("USA", "Washington");

        System.out.println(capital);
        System.out.println(capital.values());


    }
}
