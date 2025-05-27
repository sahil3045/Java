class Frog{
    int id;
    String name;
    
    public Frog(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return id + ": " + name;
    }
}
public class TOSTRING {
    public static void main(String[] args) {
        Frog frog1 = new Frog("Sam",  11);
        System.out.println(frog1);
        
    }
    
}
