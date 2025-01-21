public class Phone_Class1 implements Phone {

    public void getPicture() {
        String picture;
        String Camera;

        System.out.println("This is my Phone Camera " );
    }

    /**
     *
     */
    @Override
    public void getCalculate() {
        System.out.println("This is my Phone calculator" );
    }

    /**
     *
     */
    @Override
    public void getSides() {
        Phone.super.getSides();

        System.out.println("This is my Phone Phone " );
    }


}
