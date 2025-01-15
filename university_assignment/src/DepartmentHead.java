public class DepartmentHead extends Professor{
    private String OfficeRoom;

    public DepartmentHead(String name, int age, String employeeId, String department, double salary, String officeRoom) {
        super(name, age, employeeId, department, salary);
        OfficeRoom = officeRoom;
    }

    public String getOfficeRoom() {
        return OfficeRoom;
    }

    @Override
    public void displayinfo() {
        System.out.println("Please Enter the HOD Name "+getName());
        System.out.println("Age "+getAge());
        System.out.println("Employeeid "+getEmployeeId());
        System.out.println("Enter from which Department "+getDepartment());
        System.out.println("Salary "+getSalary());
        System.out.println("OfficeRoom "+getOfficeRoom());
    }
}