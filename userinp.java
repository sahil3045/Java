import java.util.Scanner;

public class userinp {
    public static void main(String[] args) {
        // Create Scanner object.
        Scanner str = new Scanner(System.in);
        Scanner integer = new Scanner(System.in);
        Scanner dobl = new Scanner(System.in);

        System.out.println("Enter the line: ");
        // User input is taken here.(string values)----------------------- 
        String line = str.nextLine();
        System.out.println("You Entered: " + line);

        //user input is taken here (Integer values)-----------------------
        System.out.println("Enter the integer here: ");
        int value = integer.nextInt();
        System.out.println("The integer is: " + value);

        //Use input is taken here(Double values)-----------------------
        System.out.println("Enter the double here: ");
        double dob= dobl.nextDouble();
        System.out.println("The integer is: " + dob);



    }
    
}
 