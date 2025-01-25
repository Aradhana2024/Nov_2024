public class DrivingL {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 17) {
            throw new ArithmeticException(" You must be at least 17 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
