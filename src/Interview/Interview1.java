package Interview;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview1 {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 150, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));

        //group by City
        Map<String, List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));


        //group by Age
        Map<Integer, List<Employee>> groupByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));

        //Find the count of male and female employees present in the organization.
        Map<String, Long> countOfGenderInOrg = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        //Find the count of male and female present in each department
        Map<String, Map<String, Long>> genderMapInDept  = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        //Print the names of all distinct departments in the organization.
        List<String> distinctDept = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());

        //Print employee details whose age is greater than 28 in the organisation.
        List<String> employeeGreaterThan28 = empList.stream().filter(e -> e.getAge() > 28).map(Employee::getName).collect(Collectors.toList());

        //oldest employee in dept
        Employee oldestAgeOfEmployee = empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().orElse(null);

        //Print Average age of Male and Female Employees in the organisation.
        Map<String, Double> averageAgeOfGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));

        //Print Average age of Male and Female Employees by Dept.
        Map<String, Map<String, Double>> averageAgeOfByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))));

        //Print the number of employees in each department.
        Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));


        //longest serving employee in org
        Employee longestServedEmployee = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().orElse(null);

        //longest serving employee in dept
        Map<String, Optional<Employee>> longestServedEmployeeByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));

        //Find average age of gender in each department.
        Map<String, Map<String, Double>> avgAgeOfGenderByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

        //Find youngest female employee in the organisation.
        Optional<Employee> yongestFemale = empList.stream().filter(e -> e.getGender().equals("F")).sorted(Comparator.comparing(Employee::getAge)).findFirst();

        //Find the youngest employee in each department
        Map<String, Optional<Employee>> yongestEmployeeByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getAge))));

        // Second Higest salary of a employee
        Employee secondHigestSalary = empList.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).skip(1).findFirst().orElse(null);


        List<String> startWithF = empList.stream().map(Employee::getName).filter(e -> e.startsWith("F")).collect(Collectors.toList());


        Map<String, Map<String, Optional<Employee>>> lowestSalaryByDeptByGender = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparing(Employee::getSalary)))));

        Map<String, Double> avgSalaryPerDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingLong(Employee::getSalary)));


        Map<String, Long> sumByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.summingLong(Employee::getSalary)));


        List<Person> people = Arrays.asList(
                new Person("Alice", 30, Arrays.asList("Java", "SQL")),
                new Person("Bob",   25, Arrays.asList("Python", "AWS")),
                new Person("Carol", 27, Arrays.asList("Java", "Docker", "Kubernetes")),
                new Person("David", 35, Arrays.asList("Go", "AWS")),
                new Person("Eve",   22, Arrays.asList("JavaScript", "React"))
        );

        List<String> skills = people.stream().map(Person::getSkills).flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
        System.out.println(skills);
    }
}






