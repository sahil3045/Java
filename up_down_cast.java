class Machine {
    public void start(){
        System.out.println("Machine started!") ;
    }
}

class Camera extends Machine{
    public void start(){
        System.out.println("Camera started");
    }

    public void snap(){
        System.out.println("Photo captured");
    }

}
public class up_down_cast {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap(); 

        //Upcasting
        Machine machine2 = camera1;
        machine2.start(); //it will work because start function is present in 
        // machine2.snap(); wont work because it is not present in machine class

        //downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.snap();
        camera2.start();

        Machine machine4 = new Camera();
        Camera camera3 = (Camera)machine4;
        camera3.snap();
        camera3.start();





        
    }
    
}
