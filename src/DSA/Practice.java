package DSA;


import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
//        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
//                new Employee(1,30, "Pratik",2500),
//                new Employee(2,25, "Dev",25002),
//                new Employee(3,29, "abv",23001),
//                new Employee(4,25, "demo",25100),
//                new Employee(5,22, "alex",37000),
//                new Employee(6,25, "prax",29300),
//                new Employee(7,24, "suna",35100)));
//
//        Map<Integer, List<String>> groupByAge = employeeList.stream()
//                .filter(employee -> employee.getSalary() > 30000)
//                .collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName, Collectors.toList())));
//        //System.out.println(groupByAge);
//
        List<Integer> list = Arrays.asList(1,2,3,4,7);
        Integer e = 4;
//        Iterator<Integer> itr = list.iterator();
//        while(itr.hasNext()) {
//            if(itr.next() == e) {
//        //        System.out.println("found");
//                return;
//            }
//        }
//      //  System.out.println("not found");

//        int low = 0;
//        int high = list.size()-1;
//        while(low <= high) {
//            int mid = low + (high - low)/2;
//            System.out.println("itr");
//            if(list.get(mid) == e) {
//                System.out.println("found "+ e);
//                return;
//            } else if(list.get(mid) > e) {
//                high--;
//            } else{
//                low++;
//            }
//        }
//
//        System.out.println("not found");
//

        int[] arr = {64, 34, 25, 12, 22, 11, 90};;
        bubbleSort(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }


    }

    //sorting --bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
