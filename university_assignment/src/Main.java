//Main Class
//Set the university name using the static method in the University class.
//Create an array of Person references containing a mix of Student, Professor, and DepartmentHead objects.
//Iterate over the array and call displayInfo() on each object (demonstrating polymorphism).
//Increment the totalStudents and totalProfessors counters whenever a Student or Professor object is added.
//Display the university statistics at the end.
public class Main {
    public static void main(String[] args) {


        University.setUniversityName("University of Toronto");
        System.out.println(University.getUniversityName());

        Person[] person=new Person[5];

        person[0]=new Student("Aradhana",25,101,"System Testing",8.2);

        person[1]=new Professor("Suny Singh",50,"UFT100","Software Engineering",150000.0);

        person[2]=new DepartmentHead("James Gosling",55,"UFT125","Computer Science & Engineering",200500.00,"A-105");

        for(int i=0; i< person.length; i++) {
            if (person[i].getType().equals(Student.class)) {
                System.out.println();
                person[i].displayinfo();
                University.incrementStudentCount();
            } else if (person[i].getType().equals(Professor.class)) {
                System.out.println();
                person[i].displayinfo();
                University.incrementProfessorCount();
            } else {
                System.out.println();
                person[i].displayinfo();
                University.incrementdepartmenthead();

            }
        }
        System.out.println();
        System.out.println("Display the university statistics ");
        System.out.println("Total Students " +University.getTotalStudents());
        int total=University.getTotalprofessor()+University.getTotaldepartmentheads();
        System.out.println("Total professor" +total);


    }
}