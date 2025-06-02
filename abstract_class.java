abstract class Machine{
    private int id;
    public int getId(){
        return id;
    }

    void int setId(int id){
        this.id = id;
    }

    abstract void start(); 
}

class Car extends Machine{
    @Override
    void start(){
        System.out.println("car started.");
    }
}

class Camera extends Machine{
    @Override
    void start(){
        System.out.println("Camera started");
    }

}
public class abstract_class {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        Machine machine1 = new Machine();
         
    }
}
