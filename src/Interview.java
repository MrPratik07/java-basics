import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {

        // find duplicate
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8));
        Set<Integer> unqiue = new HashSet<>();
        List<Integer> duplicates= numbers.stream().filter(n->!unqiue.add(n)).collect(Collectors.toList());


        // find even
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = integers.stream().filter(n-> n%2==0).collect(Collectors.toList());


        //find squares
        List<Integer> squares = integers.stream().map(n -> n * n).collect(Collectors.toList());

        //Filter names starting with a specific letter.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ali");
        List<String> startWithA = names.stream().filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());

        //Convert a list of strings to uppercase.
        List<String> words = Arrays.asList("java", "stream", "api");
        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        // sort elements
        List<Integer> number = Arrays.asList(5, 1, 3, 4, 2);
        List<Integer> sorted = number.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());



        // first non-empty string
         List<String> strings = Arrays.asList("", "Java", "Stream");
        Optional<String> firstNonEmpty = strings.stream().filter(e -> !e.isEmpty()).findFirst();



        //Count the number of elements greater than a given value
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        long count = num.stream().filter(n -> n > 3).count();


        //Find the maximum number in a list
        List<Integer> numb = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> max = numb.stream().max(Comparator.comparing(Integer::intValue));


        //Group elements by length of the string.
        List<String> word = Arrays.asList("cat", "dog", "elephant");
        Map<Integer, List<String>> grouping = word.stream().collect(Collectors.groupingBy(String::length));


    //Join a list of strings with a delimiter.
        List<String> wordss = Arrays.asList("Java", "Stream", "API");
        String string = wordss.stream().collect(Collectors.joining(","));




        System.out.println(string);
        CustomInterface customInterface = (a,b) -> a+b;
        //System.out.println(customInterface.sum(1,3));

        Predicate<Integer> lesserthan = i -> (i < 18);
        lesserthan.test(2);

        List<Integer> lessThan18 = numb.stream().filter(lesserthan).collect(Collectors.toList());
        System.out.println(lessThan18);

    }

}


