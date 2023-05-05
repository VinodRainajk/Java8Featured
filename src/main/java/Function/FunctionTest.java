package Function;

import Student.Student;
import Student.StudentDataBase;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

    static Predicate<Student> GPACriteria = (stdnt) -> stdnt.getGpa() > 3.5;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> highGPA =

            (StudentList, studentgpa) -> {
                Map<String, Double> studntMap = new HashMap<>();
                StudentList.forEach(student -> {
                    if (studentgpa.test(student)) {
                        studntMap.put(student.getName(), student.getGpa());
                    }
                });
                return studntMap;
            };


    public static void main(String[] args) {

        Function<String, Integer> functionoutput = (student) -> student.length();

        StudentDataBase.getAllStudents().forEach((student) ->
                {
                    System.out.println("Name of Student is " + student.getName() + " Length of Name is " +
                            functionoutput.apply(student.getName()));
                }

        );



        System.out.println( highGPA.apply(StudentDataBase.getAllStudents(),GPACriteria));



    }
}
