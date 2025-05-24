import java.util.Scanner;
public class currency_converter {
    public static void main(String[] args) {

        int Dhirams = 23;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter which currency you have: (rupees),(dhirams) ");
        String curr = sc.nextLine();
        System.out.println("Enter Amount: ");
        int amt1 = sc.nextInt();
        sc.nextLine();
        

        System.out.println("Enter currency you want to convert it into: ");
        String type = sc.nextLine();
        

        if(curr.equals("rupees") && type.equals("dhirams")){
            int result1 = amt1 / Dhirams;
            System.out.println("The amount in Dhirams is: " + result1);
        }

        else if(curr.equals("dhirams") && type.equals("rupees")){
            int result = amt1 * Dhirams;
            System.out.println("The Amount in Rupees is: " + result);
        }

        else{
            System.out.println("Currency not loaded in system till now :( ");
        }


    }
    
}
