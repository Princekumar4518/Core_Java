package Exception;

public class Eception_handling {
    public static void main(String[] args) {

        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
