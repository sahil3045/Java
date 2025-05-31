class Machine{
    public void start(){
        System.out.println("Machine started");
    }
}
interface Plant {
    public void grow();

    
}
public class anony_classes {
    public static void main(String[] args) {
        Machine mac1 = new Machine();{
            @Override 
            public void start(){
                System.out.println("Camera snapping");
            }
        }
        mac1.start();
        
    }
    
}
