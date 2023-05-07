package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFirst {

    public static void main(String[] args) {

        Predicate<Student> StudentGPA =  (student) ->student.getGpa()>3.5;
        Map<String,String> studentMap=  StudentDataBase.getAllStudents()
                        .stream()
                        .peek(System.out::println) // Shows all the values
                        .filter(StudentGPA)
                        .peek(System.out::println)// Shows values post filter
                        .collect(Collectors.toMap(student -> student.getName(), student -> student.getName()));


    }
}
