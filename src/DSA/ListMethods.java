package DSA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I-AM-AN-ID-AGENCY-SOME1","I-AM-AN-ID-AGENCY-SOME2");
        System.out.println(list.contains("I-AM-AN-ID-AGENCY"));
    }
}
