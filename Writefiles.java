import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Writefiles {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("This is line one");
            bw.newLine();
            bw.write("This is line two");
            bw.newLine();
            bw.write("last line");
        }catch(IOException e){
        System.out.println("Unable to read " + file.toString());
        }

    }
    
}
