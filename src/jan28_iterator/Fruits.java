package jan28_iterator;     // Java ListIterator

import java.util.*;

public class Fruits {

    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Grapes");
        names.add("Orange");

        for (String name : names) {
            System.out.println(name);   //  using Iterator method next() method
        }

        for (String s : names) {
            System.out.println(s);    // for-each loop
        }
    }
}