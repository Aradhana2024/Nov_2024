package jan28_iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Duplicate {
    public static void main(String[] argv) {
        List<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(40);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        HashSet<Integer> set = new HashSet<>(list1);
        System.out.println(set);

    }
}