import java.util.Scanner;

public class Array2D {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int maxArray(int [] array) {
        int max = array[0];
        for (int element: array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] myArray = new int[] {1,2,3,4,5,6,7,8,9,0};
        int sum = sumArray(myArray);
        int max = maxArray(myArray);
        System.out.printf("Sum element is: %d, Max element is: %d",sum,max);
    }
}
