class Robot {
    void speak(String text){
        System.out.println(text); 
    }
}

public class meth_parameter {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("How may I help you? ");
    }
    
}
