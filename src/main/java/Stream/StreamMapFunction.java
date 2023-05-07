package Stream;

import Student.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMapFunction {

    static List<String> GetNames()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map((Student)-> Student.getName())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(GetNames());

    }
}
