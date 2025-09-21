package DSA;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        System.out.println(st.peek());
        st.push(4);
        st.push(2);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
                
    }
}
