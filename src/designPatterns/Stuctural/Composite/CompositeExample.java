package designPatterns.Stuctural.Composite;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Employee {
    void showDetails();
}

// Leaf class
class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}

// Composite class (Manages multiple employees)
class Manager implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDetails() {
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}

// Client
public class CompositeExample {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice");
        Employee dev2 = new Developer("Bob");

        Manager manager = new Manager();
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);

        manager.showDetails();
    }
}

