package customlist;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Please enter all the student names ");

        ArrayList<Integer> id = new ArrayList<>();
        id.add(10);
        id.add(20);
        id.add(30);
        id.add(40);
        System.out.println("Student ID are : ");
    for (Integer i=0; i<= id.size(); i++ );
        System.out.println(id.get(2));
        System.out.println(id.getFirst());
        System.out.println(id.getLast());

    }
}
