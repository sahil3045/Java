class Robot23{
    private int id;

    // Inner Class!
    class Brain{
        public void think(){
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    public Robot24(int id){
        this.id = id;
    }

    public void start(){
        System.out.println("Robot starting " + id);

        Brain brain = new Brain(); 
        brain.think();
    }
}
public class innercls {
    public static void main(String[] args) {
        Robot23 robot1 = new Robot23(8);
        robot1.start();
    }
    
}
