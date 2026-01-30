import java.util.Scanner;

public class Program {

    // Method to check if a number is even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to calculate factorial
    static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        boolean even = isEven(input);
        System.out.println("Is even: " + even);

        int fact = factorial(input);
        System.out.println("Factorial: " + fact);

        scanner.close();
    }
}