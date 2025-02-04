//Base Class: Person
//Fields: name (String), age (int).
//Constructor: Accepts name and age.
//Methods:
//public void displayInfo(): Prints name and age.
//A final method getType(): Returns "Person".

public class Person {
    private int age;
    private String name;
    // Creating the Constructor
    public Person(int age, String name) {
        this.age = age;
        this.name= name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void displayinfo()
    {
        System.out.println("Name of the person"+getName()); //public void displayInfo(): Prints name.
        System.out.println("Age of the person"+getAge()); //public void displayInfo(): Prints age.
    }

    public final Class getType()
    {  // A final method getType(): Returns "Person"

        return getClass();
    }

}
