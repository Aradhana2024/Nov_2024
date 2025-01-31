package jan29practice;

import java.util.ArrayList;
import java.util.List;

class Employee {

    public Employee(Integer id, String names ) {

    }

    public static void main(String[] args) {


        ArrayList<Integer> id = new ArrayList<>();
        id.add(101);
        id.add(102);
        id.add(103);
        id.add(104);
        System.out.println("Employee Id " +id);

        ArrayList<String> names = new ArrayList<>(List.of("Alex","Charles","Hory"));
        System.out.println(names);
        names.get(2);


    }
}
