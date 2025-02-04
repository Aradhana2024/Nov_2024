package feb1;

import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers");
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(300);
        set.add(444);
        set.add(50);
        set.add(600);
        System.out.println(set);
        System.out.println(set.pollFirst());
        System.out.println(set.first());
        System.out.println(set.higher(56));



    }
}
