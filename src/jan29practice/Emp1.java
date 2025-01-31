package jan29practice;

public class Emp1 extends Employee {
    public Emp1(Integer id, String names)
    {
        super(id, names);
        System.out.println(id);
    }
    @Override
    public int hashCode() {
        return super.hashCode();

    }
}
