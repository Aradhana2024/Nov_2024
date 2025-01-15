//Static Fields: universityName (String), totalStudents (int) ,totalProfessors (int)
//Static Methods:
//setUniversityName(String name): Sets the university name.
//incrementStudentCount(): Increments the totalStudents counter.
//incrementProfessorCount(): Increments the totalProfessors counter.
//getStatistics(): Returns the university name, total students, and total professors.
public class University {

    static String UniversityName;
    static int totalStudents;
    static int totalprofessor;
    static int totaldepartmentheads;

    public static void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public static String getUniversityName() {
        return UniversityName;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalprofessor() {
        return totalprofessor;
    }

    public static int getTotaldepartmentheads() {
        return totaldepartmentheads;
    }

    public static void incrementStudentCount(){
        totalStudents=totalStudents+1;
    }
    public static void incrementProfessorCount(){
        totalprofessor=totalprofessor+1;
    }
    public static void incrementdepartmenthead()
    {
        totaldepartmentheads=totaldepartmentheads+1;
    }
}