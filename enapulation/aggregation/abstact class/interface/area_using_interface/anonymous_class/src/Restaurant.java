class Restaurant {
    public void display() {
        System.out.println("Welcome to my Restaurant" );
    }
}

class AnonymousClass {
    public void createClass() {

        // creation of anonymous class extending class Restaurant
        Restaurant p1 = new Restaurant() {
            public void display() {
                System.out.println("Display all the Menu");
            }
        };
        p1.display();
    }
}



