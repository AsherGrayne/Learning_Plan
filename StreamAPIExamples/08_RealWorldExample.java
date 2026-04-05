package StreamAPIExamples;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class RealWorldExample08 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ram", 60),
                new Student("Shyam", 40),
                new Student("Ravi", 75)
        );

        students.stream()
                .filter(s -> s.marks > 50)
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}
