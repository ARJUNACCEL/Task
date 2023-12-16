import java.util.HashMap;
import java.util.Map;

public class Grades {
    private Map<String, Integer> Grades;


    public Grades() {
        this.Grades = new HashMap<>();
    }


    public void addStudent(String name, int grade) {
        Grades.put(name, grade);
    }
    public void addStudent(String name) {
        Grades.put(name, null);
    }


    public void displayGrade(String name) {
        Integer grade = Grades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade is: " + grade);
        } else {
            System.out.println("No grade found for student: " + name);
        }
    }


    public static void main(String[] args) {

        Grades grades = new Grades();


        grades.addStudent("Arjun",97);
        grades.addStudent("Noren", 32);
        grades.addStudent("Gopal", 99);


        grades.displayGrade("Arjun");
        grades.displayGrade("Noren");
        grades.displayGrade("Gopal");

    }
}