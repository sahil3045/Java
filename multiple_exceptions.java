import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
class Test{
    public void run() throws IOException, ParseException{
        throw new IOException();
    }

    public void input() throws IOException, ParseException{
        throw new IOException();
    }
}
public class multiple_exceptions {
    public static void main(String[] args) {
        Test test = new Test();
        /*try{
            test.run();
            /////multicatch
        } catch(IOException | ParseException e){
            e.printStackTrace(); 
        }*/

        try{
            test.input();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    
}
}
