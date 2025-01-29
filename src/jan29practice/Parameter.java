package jan29practice; // Constructor Parameters

public class Parameter {
        int year;
        String car;

    public Parameter(int year, String car) {
        this.year = year;
        this.car = car;
    }
    public static void main(String[] args) {
        Parameter sc = new Parameter(2005,"BMW");
        System.out.println(sc.year);
        System.out.println(sc.car);

    }
}
