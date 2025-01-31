package jan29practice;

public class ExceptionTest {
    public static void main(String[] args) {

    try{
        int i =25/0;
        System.out.println(i);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    finally {
        System.out.println("Exception through finally" );

    }
    }
}
