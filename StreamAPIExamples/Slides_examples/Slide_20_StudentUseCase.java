package StreamAPIExamples.Slides_examples;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Slide_20_StudentUseCase {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ram", 60),
                new Student("Shyam", 40),
                new Student("Ravi", 75),
                new Student("Riya", 55),
                new Student("Raj", 48)
        );

        System.out.println("All students: " + students);

        System.out.println("\nStudents who passed (marks > 50):");

        students.stream()
                .filter(s -> s.marks > 50)
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}
