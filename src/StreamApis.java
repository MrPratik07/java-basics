//import java.util.*;
//import java.util.stream.Collectors;
//
//public class StreamApis {
//
//    public static void main(String args[]) {
//        List<Integer> list = Arrays.asList(1,2,3);
//        //list.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toList());
//        //list.stream().map(Integer::parseInt).collect(Collectors.toList());
//
//        Optional<Integer> max = list.stream().max(Integer::compare);
//        Integer sum = list.stream().mapToInt(Integer::intValue).sum();
//        long count = list.stream().filter(l->l>=2).count();
//        int total = list.stream().reduce(0, Integer::sum);
//        System.out.println(sum);
//
//        Optional<Integer> maxValue = Arrays.asList(1,3,5,3,1,6).stream().max(Comparator.comparing(Integer::valueOf));
//        System.out.println(maxValue.get());
//
//        Optional<Integer> minValue = Arrays.asList(1,3,5,3,1,6).stream().min(Comparator.comparing(Integer::valueOf));
//        System.out.println(minValue.get());
//
//        List<Integer> sorted;
//        sorted = Arrays.asList(3,1,4,2,6,5).stream().sorted(Comparator.comparing(Integer::intValue)).toList();
//        System.out.println(sorted);
//
//        List<Integer> reverseSorted;
//        reverseSorted = Arrays.asList(3,1,4,2,6,5).stream().sorted(Collections.reverseOrder(Comparator.comparing(Integer::intValue))).toList();
//        System.out.println(reverseSorted);
//
//        List<Integer> limitFive;
//        limitFive = Arrays.asList(3,1,4,2,6,5,8,9,7,0).stream().sorted(Comparator.comparing(Integer::intValue)).limit(5).toList();
//        System.out.println(limitFive);
//
//        long count1 = Arrays.asList(1, 4, 5, 3, 2).stream().count();
//        System.out.println(count1);
//
//        List<Integer> numbersList = Arrays.asList (1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9, 2);
//
//        Optional<Integer> reduceToSum = numbersList.stream().limit(5).reduce(Integer::sum);
//        int sum1 = numbersList.stream().mapToInt(number -> number.intValue()).sum();
//        System.out.println(reduceToSum.get()+" "+sum1);
//
//        double asDouble = Arrays.asList(2,3,4).stream().mapToDouble(number -> number.doubleValue()).average().getAsDouble();
//        System.out.println(asDouble);
//
//        List<Integer> even = Arrays.asList(2, 3, 4, 5, 6, 7, 8).stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//        System.out.println(even);
//
//        List<Integer> odd = Arrays.asList(2, 3, 4, 5, 6, 7, 8).stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
//        System.out.println(odd);
//
//        List<String> number = Arrays.asList("24","21","12","42","43","34","29","299");
//        Set<String> charFromTwo = number.stream().filter(e -> e.charAt(0) == '2').collect(Collectors.toSet());
//        System.out.println(charFromTwo);
//
//        Set<Integer> cubes = Arrays.asList(2, 3, 4, 5, 6).stream().map(e -> e * e * e).collect(Collectors.toSet());
//        System.out.println(cubes);
//
//
////        List<Employee> employees = new ArrayList<>();
////        employees.add(new Employee(101, "Alice", 30, 60000, "Female", "HR"));
////        employees.add(new Employee(102, "Bob", 35, 65000, "Male", "HR"));
////        employees.add(new Employee(103, "Charlie", 29, 58000, "Male", "HR"));
////        employees.add(new Employee(104, "Diana", 40, 70000, "Female", "HR"));
////        employees.add(new Employee(105, "Eva", 28, 55000, "Female", "HR"));
////
////        // Adding IT department employees
////        employees.add(new Employee(201, "Frank", 27, 75000, "Male", "IT"));
////        employees.add(new Employee(201, "Frank", 27, 75000, "Male", "IT"));
////        employees.add(new Employee(202, "Grace", 32, 85000, "Female", "IT"));
////        employees.add(new Employee(203, "Hank", 26, 72000, "Male", "IT"));
////        employees.add(new Employee(204, "Ivy", 29, 77000, "Female", "IT"));
////        employees.add(new Employee(205, "Jack", 31, 90000, "Male", "IT"));
////
////        // Adding Sales department employees
////        employees.add(new Employee(301, "Kate", 33, 68000, "Female", "Sales"));
////
////
//////        Map<String, Optional<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//////        groupByDept.forEach((dept, employeeOpt) -> {
//////            System.out.println("Department: " + dept);
//////            employeeOpt.ifPresent(employee -> System.out.println("Employee: " + employee.getName()));
//////        });
////
////        long countMale = employees.stream().filter(e -> e.getGender().equals("Male")).count();
////        System.out.println(countMale);
////
////        Set<String> dept = employees.stream().map(e -> e.getDept()).collect(Collectors.toSet());
////        System.out.println(dept);
////
////        double sum = employees.stream().mapToDouble(e -> e.getSalary()).sum();
////        System.out.println(sum);
////
////        Set<Employee> AgeLess25 = employees.stream().filter(e -> e.getAge() < 30).collect(Collectors.toSet());
////        System.out.println(AgeLess25);
//
//        List<Employee> employeeList = Arrays.asList(
//                new Employee(1, "Pratik", 26, 25000, "Male", "IT"),
//                new Employee(2, "Aditi", 29, 28000, "Female", "HR"),
//                new Employee(2, "Zditi", 29, 38000, "Female", "HR"),
//                new Employee(3, "Raj", 32, 30000, "Male", "Finance"),
//                new Employee(4, "Sneha", 24, 25000, "Female", "Marketing"),
//                new Employee(5, "Karan", 28, 27000, "Male", "Sales"),
//                new Employee(5, "Pranav", 28, 57000, "Male", "Sales")
//        );
//
//        Map<Double, List<Employee>> groupBySalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(groupBySalary);
//
//        Map<Double, Long> countofSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
//        System.out.println(countofSalary);
//
//        Map<Double, List<String>> mapByName = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(mapByName);
//
//        Map<String, Optional<Employee>> higestSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        for(Map.Entry<String, Optional<Employee>> key: higestSalary.entrySet()) {
//            //System.out.println(key.getKey()+" "+key.getValue().get().getName());
//        }
//
//
//       // List<String> mapBySalary = employeeList.stream().map(e -> "salary " + e.getSalary()).collect(Collectors.toList());
//        System.out.println(mapBySalary);
//
//        List<String> sentences = List.of("hello world", "java streams", "flatmap example");
//
//        Set<String> set = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toSet());
//        System.out.println(set);


//
//
//String s = "My name is pratik";
//List<String> words = Arrays.asList(s.split(" "));
//List<String> a = words.stream().filter(e -> e.contains("a")).collect(Collectors.toList());
//        System.out.println(a);
//
//
//List<Integer> collect = Arrays.asList(s.split(" "))
//        .stream().filter(e->e.contains("a"))
//        .flatMap(word -> Arrays.stream(new Integer[]{word.length()}))
//        .collect(Collectors.toList());
//        System.out.println(collect);
//
//    }
//}


//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//Sumation output = (a, b) -> a+b;
////System.out.println(output.sum(90,52));
//
//List<String> words = Arrays.asList("hi", "hello", "world", "yo", "code");
//Map<Integer, List<String>> groupbyLength = words.stream().collect(Collectors.groupingBy(String::length));
////System.out.println(groupbyLength);
//
//List<String> names = Arrays.asList("Anna", "bob", "Charlie", "Brian");
//Optional<String> b = names.stream().map(String::toLowerCase).filter(s -> s.startsWith("b")).findFirst();
////System.out.println(b);
//
//Map<String, Integer> scores = Map.of(
//        "Alice", 90,
//        "Bob", 75,
//        "Charlie", 85
//);
//
//List<List<Integer>> nested = Arrays.asList(
//        Arrays.asList(1, 2),
//        Arrays.asList(3, 4),
//        Arrays.asList(5)
//);
//
//List<Integer> flattern = nested.stream().flatMap(List::stream).collect(Collectors.toList());
////System.out.println(flattern);
//
//List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//
//Map<String, Long> countOfFruits = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
////System.out.println(countOfFruits);
//
//List<Customer> customers = Arrays.asList(new Customer("pratik","solapur",5000 ),
//        new Customer("devang","pune", 4000),
//        new Customer("pradyum","solapur", 2000),
//        new Customer("ajit","pune", 4500),
//        new Customer("aditya","solapur", 600));
//
//Map<String, List<String>> groupByCity = customers.stream().collect(Collectors.groupingBy(Customer::getState, Collectors.mapping(Customer::getName, Collectors.toList())));
////System.out.println(groupByCity);
//
//List<String> salarySort = customers.stream().sorted(Comparator.comparing(Customer::getSalary)).map(customer -> customer.getName()+ " = "+ customer.getSalary()).collect(Collectors.toList());
//        System.out.println(salarySort);


//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//List<Integer> numbers = Arrays.asList(2,4,3,7,8,9,6);
//List<Integer> sortedEven = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
////System.out.println(sortedEven);
//
//String s = "swiss";
////System.out.println(s.toUpperCase());
//
//List<String> words = Arrays.asList("hello", "world");
//List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
////System.out.println(upperCase);
//
//Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
////System.out.println(sum);
//
//List<String> names = Arrays.asList("Alice", "Bob", "Angela", "David");
//List<String> startWithA = names.stream().filter(word -> word.startsWith("A")).collect(Collectors.toList());
////System.out.println(startWithA);
//
//List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
//
//Set<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toSet());
////System.out.println(sortedFruits);
//
//Optional<Integer> max = numbers.stream().max(Integer::compare);
////  System.out.println(max);
//
//List<String> items = Arrays.asList("apple", "banana", "cherry");
//Optional<String> reduce = items.stream().reduce(String::concat);
////System.out.println(reduce);
//
//List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//List<Integer> set = numbers1.stream().distinct().collect(Collectors.toList());
////System.out.println(set);
//
//


import DSA.Employee;

import java.util.*;
import java.util.stream.Collectors;

//List<Employee> employee = Arrays.asList(new Employee("Male",25000, "Rakesh",25, 1),
//        new Employee("Male",25000, "Pratik",23, 2 ),
//        new Employee("Female",35000, "Pratiksha",25, 3 ),
//        new Employee("Male",65000, "Prakash",45, 3 ));
//
//Map<String, Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
////System.out.println(collect);
//
//long countMale = employee.stream().filter(emp->emp.getGender().equals("Male")).count();
//        System.out.println(countMale);
//
//long salaryMoreThan30K = employee.stream().filter(emp1 -> emp1.getSalary() > 30000).count();
//        System.out.println(salaryMoreThan30K);
//
//Set<String> names = employee.stream().map(Employee::getName).collect(Collectors.toSet());
//        System.out.println(names);
//
//Optional<Integer> salarySum = employee.stream().map(e -> e.getAge()).reduce((s1, s2) -> (s1 + s2));
//        System.out.println(salarySum);
//
//List<String> collect1 = employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(e1 -> e1.getName() + "-" + e1.getSalary()).collect(Collectors.toList());
//        System.out.println(collect1);
//
//Optional<Employee> secondHigest = employee.stream()
//        .sorted(Comparator.comparing(Employee::getSalary)
//                .reversed()).skip(1).findFirst();
//
//        System.out.println(secondHigest);
