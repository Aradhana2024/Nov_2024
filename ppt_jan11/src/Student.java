//HashCode() method
    public class Student {
        private int id;
        private String name;

        // Constructor
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getters and setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Override the hashCode() method
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        public static void main(String[] args) {
            Student student1 = new Student(1, "Aradhana");
            Student student2 = new Student(2, "Sahoo");

            // Displaying hash codes
            System.out.println("Hash code for student1: " + student1.hashCode());
            System.out.println("Hash code for student2: " + student2.hashCode());
        }
    }

// The HashCode() method is a built-in method in Java that returns a unique integer value, known as a hash code, for an object.
// The hash code is generated based on the object's content and memory address.