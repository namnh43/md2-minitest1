import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i ++) {
            if (isPrime(n)) {
                System.out.println(i);
            }
        }
    }
}
