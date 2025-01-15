//Subclass: Professor (Inherits Person)
//Additional Fields: employeeId (String), department (String), salary (double).
//Constructor: Accepts name, age, employeeId, department, and salary. Use this and super appropriately.
//Override Methods:
//displayInfo(): Prints name, age, employeeId, department, and salary.
public class Professor extends Person {
    private String employeeId;
    private String department;
    private double salary;

    public Professor(String name, int age, String employeeId, String department, double salary) {
        super(age, name);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary; //Additional Fields: employeeId (String), department (String), salary (double).
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
// Accepts name, age, employeeId, department, and salary. Use this and super appropriately.
    @Override
    public void displayinfo() {
        System.out.println("Name of Professor "+getName());
        System.out.println("Age of Professor "+getAge());
        System.out.println("Id of Professor "+getEmployeeId());
        System.out.println("Department Name "+getDepartment());
        System.out.println("Salary of Professor"+getSalary());
    } //displayInfo(): Prints name, age, employeeId, department, and salary.
}