import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the command: (start), (stop) ");
        String input = scanner.nextLine();

        switch(input){
            case "start":
            System.out.println("Machine Started!");
            break;

            case "stop":
            System.out.println("Machine Stopped!");
            break;

            default:
            System.out.println("Invalid Command!");

        
        }
         

    }
    
}
