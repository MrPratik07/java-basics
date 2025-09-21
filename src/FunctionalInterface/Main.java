package FunctionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Addition addition = (a,b) -> a + b;
        int result = addition.add(1,3);
        System.out.println(result);

        Predicate<Integer> predicate = num -> num%2 ==0;
        boolean r = predicate.test(5);
        System.out.println(r);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

    }
}
