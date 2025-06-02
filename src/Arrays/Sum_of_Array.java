package Arrays;

public class Sum_of_Array {
    public static void main(String[] args) {


        int[] array = {23, 56, 43, 66, 31, 3};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+=sum+array[i];
        }
        System.out.println(sum);
    }
}