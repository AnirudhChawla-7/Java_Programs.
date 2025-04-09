package LabExperiment_9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 1, 50000));
        employees.add(new Employee("Bob", 2, 60000));
        employees.add(new Employee("Charlie", 3, 70000));

        employees.get(1).salary = 65000; // Update Bob's salary

        employees.removeIf(employee -> employee.id == 1); // Remove Alice by id

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
