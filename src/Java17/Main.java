package Java17;

public class Main {
    public static void main(String[] args) {
        int x=3;
        switch(x) {
        case 1 -> System.out.println("x is 1");
        case 2 -> System.out.println("x is 2");
        case 3 -> System.out.println("x is 3");
        default -> System.out.println("x is not present");
        }
    }
}
