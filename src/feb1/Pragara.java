package feb1;

import java.util.ArrayList;

public class Pragara {
    public Pragara() {
        System.out.println("Using Constructor");
    }

    public static void main(String[] args) {


        ArrayList<String> pr = new ArrayList<>();

        pr.add("i am learning java. toady is class");


        System.out.println(pr.getFirst());
        System.out.println(pr.getLast());

        System.out.println(pr.stream().spliterator());
        System.out.println(pr.spliterator());



    }
}
