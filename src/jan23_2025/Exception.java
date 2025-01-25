package jan23_2025;

public class Exception
{
    public static void main(String[ ] args) {
   try {
       int[] myNumbers = {1, 2, 3};
       System.out.println(myNumbers[10]);
   } catch (java.lang.Exception e) {
       //throw new RuntimeException(e);
   }
      System.out.println("Something went wrong.");

  }
}

