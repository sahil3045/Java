class Machine{
    String name;
    int code;
    public Machine(){
        // using the third constructor here using this key 
        this("Arlie", 8);
        System.out.println("Constructor Running! ");
        
    }

    public Machine(String name){
        System.out.println("Second Constructor Running!");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third Constructor Running!");
        this.name = name;
        this.code = code;
    }

}
public class constructrs {
    public static void main(String[] args) {
        // constructor is awakened by looking at the parameters
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Sahil");
        Machine machine3 = new Machine("Manas", 19);
    }
    
}
