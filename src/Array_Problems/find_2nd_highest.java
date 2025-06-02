package Array_Problems;

public class find_2nd_highest {
    public static void main(String[] args) {
        int [] array={23,12,34,4,56,7,34,56};
        int highest=0;
        int second_highest=0;

        for(int i=0;i<array.length;i++){
            if(array[i]>highest){
                second_highest=highest;
                highest=array[i];

            }
            else if (array[i] > second_highest && array[i] != highest) {

                second_highest = array[i];
            }

        }
        System.out.println("Highest value of given array is = "+highest);
        System.out.println("Second Highest value of given array is = "+second_highest);

    }

}
