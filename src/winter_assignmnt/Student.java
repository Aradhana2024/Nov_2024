package winter_assignmnt;
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] name = new String[5];
    boolean found = false;
    System.out.println("Please Enter the students name: ");
    for (int i = 0; i < name.length; i++) {
        name[i] = sc.nextLine();
    }
    System.out.println("Enter the name of student to check the attendance");
    String student = sc.nextLine();
    for (int i = 0; i < name.length; i++) {
        if (student.equals(name[i])) {
            System.out.println(student + " is present in class ");
            found = true;
            break;

        }

    }
    if (!found) {
        System.out.println(student + "is absent in class");


    }
}

}