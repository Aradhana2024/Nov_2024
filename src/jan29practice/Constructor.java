package jan29practice;

public class Constructor {

    String name;
    int Id;
    String email;

    public Constructor() {     // calling Constructor
    name = "Aradhana";
    Id = 101;
    email ="aradhana@gmail.com";
    }
    public static void main(String[] args) {
   Constructor sc = new Constructor();
        System.out.println("employee details" +sc.Id + sc.name  +sc.email);

    }
}
