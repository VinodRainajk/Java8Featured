package Stream;

import Student.Student;
import Student.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByExample {

    public static Map<String, List<Student>> groupbyclassifier()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

    }

    public static Map<String, List<Student>> GroupbyCustomizedClassifier()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy((student)-> student.getGpa()>3.5 ? "Outstanding":"Average"));

    }

    public static Map<Integer, Map<String, List<Student>>> GroupbytwolevelGrouping()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect( Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy((student)-> student.getGpa()>3.5 ? "Outstanding":"Average")));

    }

    public static void main(String[] args) {

        System.out.println(groupbyclassifier());
        System.out.println("*****************************************");
        System.out.println(GroupbyCustomizedClassifier());
        System.out.println("*****************************************");
        System.out.println(GroupbytwolevelGrouping());
    }
}
