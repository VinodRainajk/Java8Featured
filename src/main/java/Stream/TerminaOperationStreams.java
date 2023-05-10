package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class TerminaOperationStreams {

    public static String JoiningExample()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map((s)-> s.getName())
                .collect(Collectors.joining("-"));
    }

    public static Long CountingExample()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map((s)-> s.getName())
                .collect(Collectors.counting());
    }


    public static List<String> MappingExample()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
    }

    public static Long CountingExample2()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .count();
    }
    public static void main(String[] args) {
        System.out.println("Joining Example " + JoiningExample());
        System.out.println("Counting Example " + CountingExample());
        System.out.println("Counting Example " + CountingExample2());
        System.out.println("Mapping Example " + MappingExample());
    }
}
