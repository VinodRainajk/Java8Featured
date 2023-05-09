package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.util.Optional;

public class StreamReduce {

    static Optional<Double> reduceoperation()
    {
       return StudentDataBase.getAllStudents()
                .stream()
               .map((a)-> a.getGpa())
                .reduce((a,b) -> a+b);

    }

    public static void main(String[] args) {
        System.out.println(reduceoperation());

    }
}
