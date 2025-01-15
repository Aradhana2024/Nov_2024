public abstract class Professor extends Person{

    private String employeeId;
    private String department;
    private  double salary;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Professor(String name, int age, String department, double salary, String employeeId) { //calling super (person) class constructor.
        super(name, age);
        this.department = department;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    @Override
    public void displayInfo() { //// Override Person (Super) class method
        super.displayInfo();
        System.out.println("Employee Id : "+getEmployeeId());
        System.out.println("Department : "+getDepartment());
        System.out.println("Salary : "+getSalary());
        System.out.println();

    }

    public abstract void displayinfo();
}