package Function;

import Student.StudentDataBase;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<String,Integer> functionoutput = (student) -> student.length();

        StudentDataBase.getAllStudents().forEach((student) ->
        {
            System.out.println("Name of Student is "+student.getName() +" Length of Name is "+
                    functionoutput.apply(student.getName()));
        }

        );

    }

}
