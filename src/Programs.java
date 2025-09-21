import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programs {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.add(2);

        Integer Max = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println(Max);

        Optional<Integer> secondMax = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondMax);

        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        long count = numbers.stream().count();
        System.out.println(count);

        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        boolean positiveNumber = numbers.stream().allMatch(n -> n > 0);
        System.out.println(positiveNumber);

        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

}
