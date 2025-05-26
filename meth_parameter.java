class Robot {
    void speak(String text){
        System.out.println(text); 
    }

    void jump(int height){
        System.out.println("jumping " + height);
    }

    void move(String direction, double distance){
        System.out.println("Moving " + distance + "  distance in direction " + direction);
    }
}

public class meth_parameter {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("How may I help you? ");

        sam.jump(7);

        sam.move("north",8.9);
    }

    
}
