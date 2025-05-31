import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_txt_fl {
    public static void main(String[] args) {
        String fileName = "/Users/sahilkanchan/Downloads/example.RTF"; // Replace with your file path
        File file = new File(fileName);

        Scanner in = new Scanner(fileName);
        int value = in.nextInt();
        System.out.println("Read value: " + value);

        while(in.hasNextLine()){
            String line  = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
