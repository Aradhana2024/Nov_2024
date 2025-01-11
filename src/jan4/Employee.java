package jan4;

public class Employee
{
    String ename;
    int id;
    Employee()
    {
        id=0;
        ename="Pragra";
    }
    Employee(int i,String nm)
    {
        id=i;
        ename=nm;
    }

    public void display()
    {
        System.out.println("employee name"+ename);
        System.out.println("employee id"+id);
    }
}


