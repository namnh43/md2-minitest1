import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }
        //Print array
        System.out.println(Arrays.toString(myArray));
    }
}
