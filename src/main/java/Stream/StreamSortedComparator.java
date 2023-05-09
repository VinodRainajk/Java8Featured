package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedComparator {

    static List<Student> getSortedStudent()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing((studnt)-> studnt.getName()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {


    }
}
