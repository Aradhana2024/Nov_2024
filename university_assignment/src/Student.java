//Subclass: Student (Inherits Person)
//Additional Fields: studentId (String), course (String), gpa (double).
//Constructor: Accepts name, age, studentId, course, and gpa. Use this to initialize studentId, 
//Override Methods:
//displayInfo(): Prints name, age, studentId, course, and gpa.
//Use polymorphism to change the output based on the Person reference type.

public class Student extends Person { //Subclass: Student (Inherits Person)
    private int StudentId;
    private String course;
    private double gpa; //studentId (String), course (String), gpa (double)

    //Constructor: Accepts name, age, studentId, course, and gpa. Use this to initialize studentId, course.
    public Student(String name, int age, int studentId, String course, double gpa) {
        super(age, name);  //
        StudentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    @Override //displayInfo(): Prints name, age, studentId, course, and gpa.
    public void displayinfo() {
        System.out.println("Name of the Student"+getName());
        System.out.println("Age of the student"+getAge());
        System.out.println("Id card "+getStudentId());
        System.out.println("Course to select "+getCourse());
        System.out.println("Total GPA "+getGpa());
    }
}
