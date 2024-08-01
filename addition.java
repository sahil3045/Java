import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int x = sc.nextInt();
        System.out.print("Enter the number2: ");
        int y = sc.nextInt();
        System.out.print("The sum of number1 and number2 is " + (x+y));
    }
}
