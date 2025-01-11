package jan4;

public class EmployeeData
{
    public static void main(String args[])
    {
        System.out.println("the employee details are:");
        Employee e1=new Employee(1,"Aradhana");
        Employee e2=new Employee(2,"Sahoo");
        Employee e3=new Employee();
        e1.display();
        e2.display();
        e3.display();

    }
}
