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

    public static void main(String[] args) {

        Consumer<String> consumer = (S)->  System.out.println(S.toUpperCase());
        consumer.accept("Vinod");
        System.out.println("***** Second example *******");
        printall();

    }
}
