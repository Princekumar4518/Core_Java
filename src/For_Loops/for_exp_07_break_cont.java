package Loops;

public class for_exp_07_break_cont {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            // System.out.println(i);
            if (i == 5) {
                break;
                // System.out.println(i);
            }
            System.out.println(i);
        }


        for (int i = 0; i < 50 ; i++) {
            if(i ==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
