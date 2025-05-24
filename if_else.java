public class if_else {
    public static void main (String[]args){
        int value = 16;
        if(value < 8){
            System.out.println("It is not less than 8. ");
        }
        else if(value < 10){
            System.out.println("It is not less than 10.");
        }
        else{
            System.out.println("The value is greater than 15.");
        }

        int a  = 0;
        while(true){
            System.out.println("Looping: " + a);

            if(a == 5){
                break;
            }
            a++;
            System.out.println("Running. ");
        }

    }


}
