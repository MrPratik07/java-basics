public class LogicBuild {
    public static void main(String[] args) {
        String name= "ABCBA";
        System.out.println(reverseString(name));
        swapNumbers(1,3);
    }

// reverse the String
    static String reverseString(String input) {
        char[] x= input.toCharArray();
        int left=0;
        int right=x.length-1;
        while(left<right) {
            char temp=x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }
        return new String(x);
    }

    public static void  swapNumbers(int a, int b) {
        a = a+b;
        b = a-b;
        a=  a-b;
        System.out.println(a+" "+b);
    }

    
}
