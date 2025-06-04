
package readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class app {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr); 
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line); 
            }
            

        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch(IOException e){
            System.out.println("Unable to read file.");
        }
    }
    
}
