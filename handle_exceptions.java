import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class handle_exceptions {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try{
            FileReader fr = new FileReader(file);
        } catch(FileNotFoundException e) {
            System.out.println("File not found " + file.toString());

        }

    }
    
}
