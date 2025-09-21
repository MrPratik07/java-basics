package FunctionAndOptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Funtional {
    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>(Arrays.asList(23,51,45,78));
        Optional<Integer> reduce = list.stream().reduce(Integer::max);
        System.out.println(reduce);

        String[] res={"vamsi","General","sai"};
        Predicate<String> employeePredicate= e-> e.length()>4;
        for(String s1:res) {
            if(employeePredicate.test(s1))
            {
                System.out.println (s1);
            }
        }

        Function<String,Integer> function= fn-> fn.length();
        System.out.println(function.apply("durga"));


        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, Consumer!");

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomSupplier.get());

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);


        String name = "aaa";
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName);

        String city = null;
        Optional<String> optionalCity = Optional.ofNullable(city);
        System.out.println(optionalCity.orElse("default"));
        //System.out.println(optionalCity.get());
        //optionalCity.ifPresent(s-> System.out.println(s));

    }
}
