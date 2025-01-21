interface Phone {

    void getPicture ();
    void getCalculate();

    // default method
    default void getSides() {
        System.out.println("This is my Phone.");
    }

}
