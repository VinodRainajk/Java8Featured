package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFirst {

    public static void main(String[] args) {

        Predicate<Student> StudentGPA =  (student) ->student.getGpa()>3.5;
        Map<String,String> studentMap =  StudentDataBase.getAllStudents()
                        .stream()
                        .filter(StudentGPA)
                        .collect(Collectors.toMap(Student::getName,Student::getName));


        System.out.println(studentMap);

    }
}
