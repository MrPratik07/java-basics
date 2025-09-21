package JavaPractice;

import java.util.Arrays;
import java.util.List;

public class Loop {
    public static void main(String[] args) {

        //reverse the String
        String s = "hello";
        int low = 0;
        int high = s.length()-1;
        String output = "";
        char temp;
        char[] characters = s.toCharArray();
        while(low<high){
            temp=characters[low];
            characters[low] = characters[high];
            characters[high] = temp;
            low++;
            high--;
        }

        for(char c:characters) {
            output+=c;
        }
        //System.out.println(output);


        //find the largest in the string
        List<Integer> numbers = Arrays.asList(3,5,7,9,2,4);
        int max = 0;
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        //System.out.println(max);


        //Count Occurrences of a Character in a String
        String string = "ChaRacteRsCaRCZWEslPaNCuQeWLfAIyE";
        char c = 'e';
        int count =0;
        string=string.toLowerCase();
        for(char x:string.toCharArray()) {
            if(x == c) {
                count++;
            }
        }
        //System.out.println(count);

        //Check for Palindrome
        String race = "arraccecarra";
        int low1=0;
        int high1 = race.length()-1;
        while(low1<high1) {
            if(race.charAt(low1) != race.charAt(high1)) {
                //System.out.println("false");
                return;
            }
            low1++;
            high1--;
        }
        //System.out.println("true");

        //Sum of Even Numbers in a List
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = listNumbers.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        //System.out.println(sum);

        //Find the Factorial of a Number
        int fact = 1;
        int n=5;
        while(n!=1) {
            fact*=n;
            n--;
        }
        //System.out.println(fact);


        //Fibonacci series
        int input =5;
        int first=0;
        int second=1;
        //System.out.print(first+" ");
        //System.out.print(second+" ");
        for(int i=2;i<input;i++) {
            int ans = first+second;
            //System.out.println(ans+" ");
            first = second;
            second = ans;
        }

        //Check if a Number is Prime
        int num=3;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

        //find common btw list
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        for(int i=0;i<list1.size();i++) {
            if(list2.contains(list1.get(i))) {
                //System.out.print(list1.get(i)+" ");
            }
        }


        //find vowels
        String hello = "hello";
        int counter = 0;
        hello = hello.toLowerCase();
        for(char ele: hello.toCharArray()) {
            if(ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u') {
                counter++;
            }
        }

        //System.out.println(counter);


        int number = 1009100001;
        int sum1 = 0;
        while(number!=0) {
            int remain = number % 10;
            sum1+=remain;
            number = number / 10;
        }

        System.out.println(sum1);

    }
}
