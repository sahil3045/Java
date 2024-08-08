import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        scanner.close();
        
        System.out.println("Perfect numbers between " + lowerBound + " and " + upperBound + " are:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}