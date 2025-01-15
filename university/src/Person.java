// using get() and final method to display the name and age.
//Base Class: Person
//o	Fields: name (String), age (int).
//Constructor: Accepts name and age.
//Methods:
//public void displayInfo(): Prints name and age.
//A final method getType(): Returns "Person".
public class Person {

    private String name;//
    private int age;

    public Person(String name, int age) {
        this.name = name; // Reference to the name variable
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void displayInfo() { // super class method to display information.
        System.out.println();
        System.out.println("Please enter the Name : " + getName()); //
        System.out.println("Please enter the Age : " + getAge());
    }

    public final Class getType() {
        return getClass();
    }
}