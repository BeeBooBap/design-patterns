package Streams;

import java.util.List;
import java.util.stream.Stream;

public record Employee(int id, String name, double salary) {
    public double salaryIncrement(double number) {
// ...
        return salary() + 10;
    }
    public static Employee findById(int id) {
// ...
        return null;
    }

    public List<Employee> filterEmployees(double salaryThreshold, Integer[] empIds) {
        return Stream.of(empIds)
                .filter( empID -> Employee.findById(empID) == null)
                .filter ( empID -> Employee.findById(empID).salary > salaryThreshold)
                .map(Employee::findById)
                .toList();
    }
}


