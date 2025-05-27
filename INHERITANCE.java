class Machin{
    public void start(){
        System.out.println("Machine Started!");
    }

    public void stop(){
        System.out.println("Machine stopped!");
    }

}

class Car extends Machin {
    @Override
    public void start(){
        super.start(); 
    }
    public void Wipewindshield(){
        System.out.println("Wind shield wiped!");
    }
    
}
public class INHERITANCE {
    public static void main(String[] args) {
        Machin mac1 = new Machin();

        mac1.start();
        mac1.stop();

        Car car1 = new Car();
        car1.start();
        car1.Wipewindshield();
    }
}
