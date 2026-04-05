package StreamAPIExamples.Slides_examples;

import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ": " + salary;
    }
}

public class Slide_21_TotalSalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 55000),
                new Employee("Diana", 65000)
        );

        System.out.println("Employees: " + employees);

        // Calculate total salary
        int totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Salary: " + totalSalary);

        // Calculate average salary
        double avgSalary = employees.stream()
                .mapToInt(e -> e.salary)
                .average()
                .orElse(0.0);

        System.out.println("Average Salary: " + avgSalary);
    }
}
