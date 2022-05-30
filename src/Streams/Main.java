package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static List<String> processList(List<List<String>> names) {
        return names.stream()
                .flatMap(List::stream)
                .toList();
    }

    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };
        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .forEach(employee -> employee.salaryIncrement(10.0));

        Integer[] empIds = {1, 2, 3};
        List<Employee> employees = Stream.of(empIds).map(Employee::findById).toList();

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        System.out.println(Main.processList(namesNested));
    }
}
