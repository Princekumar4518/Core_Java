package Array_Problems;

public class Finding_Max_Min {
    public static void main(String[] args) {
        int[] array = {20, 56, 78, 56, 45, 34, 9, 5, 1};
        int max_value = array[0];
        int min_value = array[0];

        for (int i = 0; i < array.length; i++) {

            // condition for Max vlaue
            if (max_value < array[i]) {
                max_value = array[i];
            }

            // Condition for Min value
            if (min_value > array[i]) {
                min_value = array[i];
            }


        }
        System.out.println(max_value);
        System.out.println(min_value);
    }
}