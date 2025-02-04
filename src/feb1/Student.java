// a list of the countries of the world. make sure it maintain the insertion oder.
// Tree set never allow NULL.

package feb1;

import java.util.LinkedHashSet;

public class Student {
    public static void main(String[] args) {
        System.out.println("country names");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Toronto");
        set.add("Ottawa");
        set.add("Quebec");
        set.add("BC");
        System.out.println(set.getFirst());
        for(int i=0; i<= set.size(); i++ )
        System.out.println(set.reversed());
        System.out.println(set.getFirst());
        System.out.println(set.removeLast());


    }
}
