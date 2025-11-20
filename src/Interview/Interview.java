package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class Interview {
    public static void main(String[] args) {
//        String s = "bbbbbaabcdaaaab";
//        char[] arr = s.toCharArray();
//        int low=0;
//        int high=arr.length-1;
//
//        while(low<high) {
//            char temp = arr[low];
//            arr[low]= arr[high];
//            arr[high] = temp;
//            low++;
//            high--;
//        }
//        String output = new String(arr);
//        System.out.println(output);


//        int a = 1;
//        int b = 2;
//
//        a = a+b;
//        b = a-b;
//        a = a- b;
//        System.out.println(a+" "+b);

//        Map<Character, Integer> map =  new HashMap<>();
//        String x = "abcdefabcef";
//        for(char c:x.toCharArray()) {
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//
//        for(Character key: map.keySet()) {
//            System.out.println(key+"->"+map.get(key));
//        }

//        int x = 17;
//        if(x<=1) {
//            System.out.println("false");
//            return;
//        }
//        for(int i=2;i<=x/2;i++) {
//            if(x%i==0) {
//                System.out.println("false");
//                return;
//            }
//        }
//
//        System.out.println("true");

//        String x = "abcba";
//
//        int low =0;
//        int high = x.length()-1;
//
//        while(low<high) {
//            if(x.charAt(low) != x.charAt(high)) {
//                System.out.println("false");
//                return;
//            }
//
//            low++;
//            high--;
//        }
//
//        System.out.println("true");

//        int[] nums =  new int[]{2,3,7,4,5,6};
//        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
//        for (int num : nums) {
//            if (num > highest) {
//                secondHighest = highest;
//                highest = num;
//            } else if (num > secondHighest && num != highest) {
//                secondHighest = num;
//            }
//        }
//        System.out.println(secondHighest);


//        int number = 9474;
//        int original = number, sum=0;
//
//        int digits = String.valueOf(number).length();
//        while(number > 0) {
//            int digit = number % 10;
//            sum+=Math.pow(digit, digits);
//            number /=10;
//        }
//
//        System.out.println(sum == original);


        String s = "java is my favourite languageeee";

        Map<Integer, List<String>> groupByLength = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);

//        String concatFirstChar = Arrays.stream(s.split(" "))
//                .map(c -> String.valueOf(c.charAt(0)))
//                .collect(Collectors.joining());
//        System.out.println(concatFirstChar);

        Optional<String> longestString = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst();
        System.out.println(longestString);


        List<Integer> list = List.of(2,4,5,6,7,9,10);

        Optional<Integer> secondHigest = list.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHigest);

        Map<String, Long> map =  list.stream()
              .collect(Collectors.groupingBy(
                      n-> n%2==0 ? "Even":"Odd",
                      Collectors.counting()
              ));
        System.out.println(map);

        Map<String,Integer> output = list.stream()
                .collect(Collectors.groupingBy(
                n-> n % 2 ==0 ? "Even" : "Odd",
                Collectors.summingInt(Integer::intValue)
        ));

        System.out.println(output);


        String s1 = "A man, a plan, a canal: Panama";
        String onlyLetters = s1.chars().filter(Character::isLetter).mapToObj(c -> String.valueOf((char )c)).map(String::toLowerCase).collect(Collectors.joining());
        System.out.println(onlyLetters);


        String s2= "PratikP";

        Map<String, Long> collect = Arrays.stream(s2.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //sortColors(new int[]{2,0,2,1,1,0});

        String str1 = "hello";
        String str2 = str1;
        str2 = "hello";
        System.out.println(str1);
        System.out.println(str2 ==str1);

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str3 == str4);

        List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful");

        List<String> words = sentences.stream()
                .map(se->se.split(" "))
                .flatMap(Arrays::stream)               // Stream<String>
                .collect(Collectors.toList());

        System.out.println(words);



        List<String> stringss = Arrays.asList("Java", "is", "BeautiFul", "Language");
        String concatUsingComma = stringss.stream().collect(Collectors.joining(","));
        System.out.println(concatUsingComma);

        Optional<String> first = stringss.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();

        Optional<String> max = stringss.stream().max(Comparator.comparing(String::length));
        System.out.println(first);


        List<String> fruits = Arrays.asList(
                "apple", "banana", "apricot", "cherry", "blueberry",
                "avocado", "blackberry", "banana", "apple"
        );

        Map<Character, Map<String, Long>> groupByChar = fruits.stream().collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println(groupByChar);
    }


    public static void sortColors(int[] arr) {
        //Write your code here
        int n = arr.length;
        boolean swapped;

        for(int i=0;i< n-1;i++) {
            swapped = false;
            for(int j=0;j< n-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }

        for(int x:arr){
            System.out.println(x);
        }

    }








}
