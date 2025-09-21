package Exception;

public class Main {
    public static void main(String[] args) throws CustomException {
        try {
            System.out.println(findIfZero(0));
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean findIfZero(int i) throws CustomException {
        if(i == 0) {
            throw new CustomException("found 0");
        }
        return true;
    }
}
