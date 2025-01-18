import java.util.Scanner;
class Student {
    private String name;
    private int age;
    Student(){
        this.name = "Aradhana";
        this.age = 30;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
    }
}
public class AccessData{
    public static void main(String args[]) {
        //Reading values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();
        Student obj1 = new Student(name, age);
        obj1.display();
        Student obj2 = new Student();
        obj2.display();
    }
}
