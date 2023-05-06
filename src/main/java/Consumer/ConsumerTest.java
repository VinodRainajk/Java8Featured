package Consumer;

import Student.Student;
import Student.StudentDataBase;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerTest {


    public static void printall()
    {


        Consumer<Student> consumerStudent =  (student)-> System.out.println(student);
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(consumerStudent);


    }

    public static void printSeletec() {
        Consumer<Student> consumerStudent = (student) -> System.out.println(student);
        Consumer<Student> c1 = (student) -> System.out.print(student.getName());
        Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());
        List<Student> studentList = StudentDataBase.getAllStudents();
        //studentList.forEach(c1.andThen(c2));
        studentList.forEach((student) -> {
            System.out.println(student.getActivities());
            System.out.println(student.getName());
        });
    }

    public static void main(String[] args) {
        int value = 8;
        Consumer<String> consumer = (S)->  System.out.println(S.toUpperCase());
        value = 9;
        consumer.accept("Vinod");

        System.out.println("***** Second example *******");
       // printall();
        printSeletec();

    }
}
