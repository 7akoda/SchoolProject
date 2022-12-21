import java.sql.SQLOutput;
import java.util.ArrayList;
//main class where i run everything from other classes
public class Main {
    public static void main(String[] args){
//name of school
School School1 = new School("Vento Aureo", "Naples", 5);
//printing out parameters for school
        System.out.println(School1);
        System.out.println(" ");
        //calling on array lists from school class
        ArrayList<Teacher> Teachers = School1.getTeachers();
        ArrayList<Student> Students = School1.getStudents();
        ArrayList<Student> Courses = School1.getCourses();
        //adding students to array list
        Students.add(new Student("Guido", "Mista", 10));
        Students.add(new Student("Giorno", "Giovanna", 9));
        Students.add(new Student("Narancia", "Ghirga", 8));
        Students.add(new Student("Leone", "Abbacchio", 12));
        Students.add(new Student("Bruno", "Bucciarati", 12));
        Students.add(new Student("Pannacotta", "Fugo", 12));
        Students.add(new Student("Trish", "Una", 9));
        Students.add(new Student("Koichi", "Hirose", 11));
        Students.add(new Student("Vinegar", "Doppio", 10));
        Students.add(new Student("Coco", "Jumbo", 8));
        Teachers.add(new Teacher("Jean Pierre", "Polnareff", "P.E"));
        Teachers.add(new Teacher("Jotaro", "Kujo", "Marine Biology"));
        Teachers.add(new Teacher("Risotto", "Nero", "Geology"));
            System.out.println("Students:");
            //for each loop that prints out all students
        for (Student s : Students){
                System.out.println(s);
        }
        System.out.println(" ");
            System.out.println("Teachers:");
        //for each loop that prints out all teachers
            for (Teacher t : Teachers){
                    System.out.println(t);
            }
        System.out.println(" ");
            //creating new instance of students listed above to then delete them
            Student s1Remove = new Student("Pannacotta", "Fugo", 12);
            Student s2Remove = new Student("Bruno", "Bucciarati", 12);
            Students.remove(s1Remove);
            Students.remove(s2Remove);
            //creating new instance of a teacher listed above to then delete them
            Teacher t1Remove = new Teacher("Risotto", "Nero", "Geology");
            Teachers.remove(t1Remove);

            System.out.println("Students after expulsion:");
        //for each loop that prints out all students after removal
            for (Student s : Students){
                    System.out.println(s);
            }
        System.out.println(" ");
            System.out.println("Teachers after layoffs:");
        //for each loop that prints out all teachers after removal
            for (Teacher t : Teachers){
                    System.out.println(t);
            }





    }

}